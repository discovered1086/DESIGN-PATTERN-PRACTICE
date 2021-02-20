package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

public class VinLoadScheduler extends AbstractScheduler{

    public VinLoadScheduler(VDCCEnvironment environment) {
        super(environment);
    }

    public void updateVinLoadDatabase(){
        System.out.println("Running VinLoad scheduler");
        updateDatabase("UPDATE vehicle set auth = 1 WHERE vin='ABCDEFGHIKL' ");
    }
}
