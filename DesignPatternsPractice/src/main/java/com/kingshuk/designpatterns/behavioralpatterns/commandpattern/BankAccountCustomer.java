package com.kingshuk.designpatterns.behavioralpatterns.commandpattern;

import java.util.List;

public class BankAccountCustomer {

    public static void main(String[] args) {
        //First create a receiver
        BankAccount bankAccount = new BankAccount(500, 200);

        BankAccountReceiver receiver = new BankAccountReceiver(bankAccount);

        //Create the invoker
        BankAccountInvoker invoker = new BankAccountInvoker();


        //Let's say the requirement is to make 5 deposits of 300, 400, 500, 250 and 100
        //And then make 3 withdrawals of 100 each and one withdrawl of 500 which is over the limit
        List<BankAccountCommand> bankAccountCommands = List.of(new BankAccountDepositCommand(receiver, 300),
                new BankAccountDepositCommand(receiver, 400),
                new BankAccountDepositCommand(receiver, 500),
                new BankAccountDepositCommand(receiver, 250),
                new BankAccountDepositCommand(receiver, 100),
                new BankAccountWithdrawlCommand(receiver, 100),
                new BankAccountWithdrawlCommand(receiver, 500),
                new BankAccountWithdrawlCommand(receiver, 100),
                new BankAccountWithdrawlCommand(receiver, 100));

        for (BankAccountCommand command : bankAccountCommands) {
            invoker.setCommand(command);
            invoker.performAction();
        }

        System.out.println("Final balance of the account: " + bankAccount.getBalance());
    }
}
