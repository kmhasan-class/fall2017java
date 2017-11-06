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
public class SavingsAccount extends BankAccount {
    private int withdrawalCounter;
    
    public SavingsAccount(int accountId,
            String accountName,
            String emailAddress,
            double balance) {
        super(accountId, accountName, emailAddress, balance);
        withdrawalCounter = 0;
    }
    
    @Override
    public boolean withdraw(double amount) {
        boolean withdrawalSuccess = false;
        
        if (withdrawalCounter <= 10 || amount <= 10000) {
            withdrawalSuccess = super.withdraw(amount);
        } else {
            double additionalAmount = amount - 10000;
            double serviceCharge = additionalAmount * 0.01;
            withdrawalSuccess = super.withdraw(amount + serviceCharge);
        }
        
        if (withdrawalSuccess)
            withdrawalCounter++;
        
        return withdrawalSuccess;
    }

}
