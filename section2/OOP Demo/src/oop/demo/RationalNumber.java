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
    
    public RationalNumber add(RationalNumber b) {
        RationalNumber a = this;
        RationalNumber c = new RationalNumber();
        c.denominator = a.denominator * b.denominator;
        c.numerator = a.numerator * b.denominator + a.denominator * b.numerator;
        return c;
    }
}
