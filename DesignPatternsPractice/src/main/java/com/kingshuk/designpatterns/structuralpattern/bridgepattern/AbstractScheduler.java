package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class AbstractScheduler {

    private VDCCEnvironment environment;

    public void updateDatabase(String query){
        environment.performDatabaseUpdate(query);
    }
}
