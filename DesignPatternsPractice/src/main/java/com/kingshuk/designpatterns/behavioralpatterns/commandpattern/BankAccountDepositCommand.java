package com.kingshuk.designpatterns.behavioralpatterns.commandpattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccountDepositCommand implements BankAccountCommand{

    private BankAccountReceiver bankAccountReceiver;
    private double amount;


    @Override
    public void performFinancialTransaction() {
        bankAccountReceiver.depositMoney(amount);
    }
}
