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
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }
    
    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }
    
    public ComplexNumber add(ComplexNumber b) {
        double cReal;
        double cImaginary;
        
        ComplexNumber a = this;
        
        cReal = a.real + b.real;
        cImaginary = a.imaginary + b.imaginary;
        
        ComplexNumber c = new ComplexNumber(cReal, cImaginary);
        
        return c;
    }
    
    public ComplexNumber subtract(ComplexNumber b) {
        double cReal;
        double cImaginary;
        
        ComplexNumber a = this;
        
        cReal = a.real - b.real;
        cImaginary = a.imaginary - b.imaginary;
        
        ComplexNumber c = new ComplexNumber(cReal, cImaginary);
        
        return c;
    }
    
    public ComplexNumber multiply(ComplexNumber b) {
        double cReal;
        double cImaginary;
        
        ComplexNumber a = this;
        
        cReal = a.real * b.real - a.imaginary * b.imaginary;
        cImaginary = a.real * b.imaginary + a.imaginary * b.real;
        
        ComplexNumber c = new ComplexNumber(cReal, cImaginary);
        
        return c;
    }
    
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
        //return real + " + " + imaginary + "i";
    }
}
