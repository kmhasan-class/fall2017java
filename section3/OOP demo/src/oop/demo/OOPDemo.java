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
public class OOPDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, 9);
        ComplexNumber b = new ComplexNumber(6, -3);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        ComplexNumber c;
        
        c = a.add(b);
        System.out.println("a + b = " + c);
        
        c = a.subtract(b);
        System.out.println("a - b = " + c);
        
        c = a.multiply(b);
        System.out.println("a x b = " + c);
    }
    
}
