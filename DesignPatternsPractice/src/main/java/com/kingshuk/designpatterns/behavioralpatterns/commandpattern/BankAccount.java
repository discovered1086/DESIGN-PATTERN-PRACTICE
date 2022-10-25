package com.kingshuk.designpatterns.behavioralpatterns.commandpattern;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
public class BankAccount {

    private double balance;
    private double withdrawlLimit;
}
