/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo;

import account.BankAccount;
import account.CurrentAccount;

/**
 *
 * @author kmhasan
 */
public class OOPDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
        */
        String s = "hello";
        String t = s.toUpperCase();
        
        BankAccount a = new BankAccount(45, "John Doe", 1000);
        //BankAccount a = new BankAccount();
        a.deposit(1000);
        a.withdraw(40);
        //a.balance = 0;
        System.out.println(a);
        
        CurrentAccount b = new CurrentAccount(50, "Test", 1000);
        b.deposit(1000);
        b.withdraw(40);
        System.out.println(b);
                
    }
 
}
