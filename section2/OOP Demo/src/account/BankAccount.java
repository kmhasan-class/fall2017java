/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author kmhasan
 */
public class BankAccount {
    private int accountId;
    private String accountName;
    protected double balance;
    
    public BankAccount() {
        accountId = 0;
        accountName = "Whatever";
        balance = 0.0;
    }
    
    public BankAccount(int accountId, String accountName, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
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
