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
        RationalNumber a = new RationalNumber(2, 5);
        RationalNumber b = new RationalNumber(3, 2);
        RationalNumber c = a.add(b);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Result: " + c);
    }
    
}
