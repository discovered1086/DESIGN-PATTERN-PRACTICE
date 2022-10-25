package com.kingshuk.designpatterns.behavioralpatterns.commandpattern;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public class BankAccountInvoker {

    private BankAccountCommand command;

    public void performAction(){
        command.performFinancialTransaction();
    }
}
