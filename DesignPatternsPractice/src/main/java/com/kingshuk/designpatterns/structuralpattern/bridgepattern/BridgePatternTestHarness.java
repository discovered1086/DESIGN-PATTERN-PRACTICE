package com.kingshuk.designpatterns.structuralpattern.bridgepattern;

public class BridgePatternTestHarness {

    public static void main(String[] args) {
        VinLoadScheduler vinLoadScheduler = new VinLoadScheduler
                (new VDCCDevEnvironmentImpl("DevDatasource"));

        vinLoadScheduler.updateVinLoadDatabase();

        vinLoadScheduler.setEnvironment(new VDCCProdEnvironmentImpl("ProdDatasource"));

        vinLoadScheduler.updateVinLoadDatabase();

        VStatScheduler vStatScheduler = new VStatScheduler
                (new VDCCDevEnvironmentImpl("DevDatasource"));

        vStatScheduler.updateVStatLoadDatabase();

        vStatScheduler.setEnvironment(new VDCCProdEnvironmentImpl("ProdDatasource"));

        vStatScheduler.updateVStatLoadDatabase();
    }
}
