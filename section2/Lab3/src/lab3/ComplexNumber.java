/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author kmhasan
 */
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    // CONSTRUCTOR
    public ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }
    
    public ComplexNumber() {
        
    }
    
    public ComplexNumber add(ComplexNumber b) {
        ComplexNumber a = this;
        
        double r = a.real + b.real;
        double i = a.imaginary + b.imaginary;
        ComplexNumber c = new ComplexNumber(r, i);
        
        return c;
    }
    
    public ComplexNumber subtract(ComplexNumber b) {
        // ADD YOUR CODE HERE
        return null;
    }
    
    public ComplexNumber multiply(ComplexNumber b) {
        // ADD YOUR CODE HERE
        return null;
    }
    
    public ComplexNumber divide(ComplexNumber b) {
        // ADD YOUR CODE HERE
        return null;
    }
    
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
