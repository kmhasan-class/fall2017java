/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo;

import account.BankAccount;

/**
 *
 * @author kmhasan
 */
public class CreditCard extends BankAccount {
    // access modifiers: private, protected, public
    private double creditLimit;

    public CreditCard(int accountId,
            String accountName,
            String emailAddress,
            double balance,
            double creditLimit) {
        super(accountId, accountName, emailAddress, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean deposit(double amount) {
        if (super.deposit(amount)) {
            creditLimit = creditLimit + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount >= 0 && amount <= creditLimit) {
            balance = balance - amount;
            creditLimit = creditLimit - amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + creditLimit;
    }
}
