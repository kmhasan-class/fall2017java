/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo;

import account.CreditCard;
import account.CurrentAccount;
import account.BankAccount;

/**
 *
 * @author kmhasan
 */
public class OOPDemo {

    /*
    Lab 5 Tasks:
    
    Create new subtypes of the BankAccount type
    
    SavingsAccount
    - Withdraw: For every withdrawal over 10,000 taka,
      the account holder will pay 1% as service charge.
      For the first 10 withdrawals, though, there won't
      be any service charge.
    - Deposit: For every deposit over 1,00,000 taka,
      the account holder will get 1% taka bonus. However,
      the total bonus a account holder gets will not exceed
      1,000 taka.
    
    FixedDeposit
    - Withdraw: For every withdrawal before the maturity
      period, there will 1% taka service charge imposed.
    - Deposit: There will not be any additional benefits.
    - Close: If the account is closed after maturity period
      the account holder will get a 10% interest on the principal
      amount.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
*/
        boolean isSuccessful;
        
        BankAccount a = new BankAccount(3001, "Md. Rakibul Hasan", "loverboy420@yahoo.com", 5000.0);
        isSuccessful = a.deposit(-4000);
        System.out.println("Deposit successful = " + isSuccessful);
        isSuccessful = a.withdraw(100);
        System.out.println("Withdraw successful = " + isSuccessful);
        a.withdraw(a.getBalance());
        System.out.println(a);
        
        CurrentAccount b = new CurrentAccount(3002, "Monirul Hasan", "kmhasan@gmail.com", 1000);
        b.deposit(1000);
        b.withdraw(500);
        System.out.println(b);
        
        CreditCard c = new CreditCard(3003, "Hasan Tareque", "hasantareque007@gmail.com", 0, 50000);
        c.withdraw(5000);
        c.deposit(1000);

        System.out.println(c);
    }
    
}
