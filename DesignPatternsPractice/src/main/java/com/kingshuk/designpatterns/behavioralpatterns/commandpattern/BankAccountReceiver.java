package com.kingshuk.designpatterns.behavioralpatterns.commandpattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccountReceiver {

    private BankAccount bankAccount;

    public void depositMoney(double amount){
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }


    public void withdrawMoney(double amount){
        if(amount <= bankAccount.getWithdrawlLimit()){
            bankAccount.setBalance(bankAccount.getBalance() - amount);
        }
    }
}
