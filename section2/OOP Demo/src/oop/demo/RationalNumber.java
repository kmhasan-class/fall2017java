/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo;

/**
 *
 * @author kmhasan
 */
public class RationalNumber {
    private long numerator;
    private long denominator;
    
    // Default constructor
    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }
    
    // Constructor
    public RationalNumber(long n, long d) {
        numerator = n;
        denominator = d;
    }
    
    public RationalNumber add(RationalNumber b) {
        RationalNumber a = this;
        RationalNumber c = new RationalNumber();
        c.denominator = a.denominator * b.denominator;
        c.numerator = a.numerator * b.denominator + a.denominator * b.numerator;
        return c;
    }
    
    public RationalNumber subtract(RationalNumber b) {
        RationalNumber a = this;
        RationalNumber c = new RationalNumber();
        c.denominator = a.denominator * b.denominator;
        c.numerator = a.numerator * b.denominator - a.denominator * b.numerator;
        return c;
    }
    
    public RationalNumber subtractAlternateApproach(RationalNumber b) {
        return add(new RationalNumber(-b.numerator, b.denominator));
    }
    
    public RationalNumber multiply(RationalNumber b) {
        RationalNumber a = this;
        RationalNumber c = new RationalNumber();
        c.numerator = a.numerator * b.numerator;
        c.denominator = a.denominator * b.denominator;
        return c;
    }
    
    public RationalNumber divide(RationalNumber b) {
        RationalNumber a = this;
        RationalNumber c = new RationalNumber();
        c.numerator = a.numerator * b.denominator;
        c.denominator = a.denominator * b.numerator;
        return c;
    }
    
    public RationalNumber divideAlternateApproach(RationalNumber b) {
        return multiply(new RationalNumber(b.denominator, b.numerator));
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public long gcd(long a, long b) {
        if (a == 0)
            return b;
        else return gcd(b % a, a);
    }
    
    public RationalNumber reduce() {
        long d = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / d;
        this.denominator = this.denominator / d;
        return this;
    }
}
