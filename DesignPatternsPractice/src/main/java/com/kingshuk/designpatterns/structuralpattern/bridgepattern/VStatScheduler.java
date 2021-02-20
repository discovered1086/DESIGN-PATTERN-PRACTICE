package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

public class VStatScheduler extends AbstractScheduler {

    public VStatScheduler(VDCCEnvironment environment) {
        super(environment);
    }

    public void updateVStatLoadDatabase(){
        System.out.println("Running VSTAT scheduler");
        updateDatabase("UPDATE vstat set vstat = 1 WHERE vin='ABCDEFGHIKL' ");
    }
}
