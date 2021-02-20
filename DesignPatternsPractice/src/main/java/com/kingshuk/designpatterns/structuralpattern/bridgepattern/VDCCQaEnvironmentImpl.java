package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

public class VDCCQaEnvironmentImpl implements VDCCEnvironment {
    private String datasource;

    @Override
    public void performDatabaseUpdate(String query) {
        System.out.println("Performing database update in " + datasource +
                " with given query " + query);
    }
}
