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
public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountId,
            String accountName,
            String emailAddress,
            double balance) {
        super(accountId, accountName, emailAddress, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + 20);
    }
}
