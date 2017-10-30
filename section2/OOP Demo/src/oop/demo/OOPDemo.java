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
        RationalNumber a; // declaration
        a = new RationalNumber(2, 3); // memory allocation/ instantiation
        // We get the memory from the "Heap"
        RationalNumber b = new RationalNumber(3, 4);
        RationalNumber c;
        
                
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        c = a.multiply(b);
        System.out.println("Multiply: " + c);
        System.out.println("After reduction: " + c.reduce());
        
        c = a.add(b);
        System.out.println("Add: " + c);
        System.out.println("After reduction: " + c.reduce());
        
    }
 
}
