/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import account.BankAccount;

/**
 *
 * @author kmhasan
 */
public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountId, String accountName, double balance) {
        super(accountId, accountName, balance);
    }
    
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + 20);
        /*
        if (amount > 0 && amount + 20 <= balance) {
            balance = balance - amount - 20;
            return true;
        } else {
            return false;
        }
        */
    }
    
}
