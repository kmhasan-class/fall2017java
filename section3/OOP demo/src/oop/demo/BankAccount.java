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
public class BankAccount {

    private int accountId;
    private String accountName;
    private String emailAddress;
    private double balance;

    public BankAccount(int accountId,
            String accountName,
            String emailAddress,
            double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.emailAddress = emailAddress;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        return accountId + " " + accountName + " " + balance;
    }
}
