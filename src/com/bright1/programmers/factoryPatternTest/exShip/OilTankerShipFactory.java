package com.bright1.programmers.factoryPatternTest.exShip;

public class OilTankerShipFactory extends ShipFactory{


    private OilTankerShipFactory() {}

    private static class SingleInstanceHolder {
        private static final OilTankerShipFactory INSTANCE = new OilTankerShipFactory();
    }

    public static OilTankerShipFactory getInstance() {
        return OilTankerShipFactory.SingleInstanceHolder.INSTANCE;
    }

    @Override
    protected Ship createShip() {
        return new ContainerShip("oiltanker", "15T", "blue");
    }
}
