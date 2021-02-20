package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VDCCDevEnvironmentImpl implements VDCCEnvironment {
    private String datasource;

    @Override
    public void performDatabaseUpdate(String query) {
        System.out.println("Performing database update in " + datasource +
                " with given query " + query);
    }
}
