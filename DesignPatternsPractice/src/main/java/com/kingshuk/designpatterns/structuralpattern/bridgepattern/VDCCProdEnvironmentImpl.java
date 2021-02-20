package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
public class VDCCProdEnvironmentImpl implements VDCCEnvironment {

    private String datasource;

    @Override
    public void performDatabaseUpdate(String query) {
        System.out.println("Performing database update in " + datasource +
                " with given query " + query);
    }
}
