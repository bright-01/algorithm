package com.bright1.programmers.factoryPatternTest.exShip;

public class ContainerShipFactory extends ShipFactory{

    private ContainerShipFactory() {}

    private static class SingleInstanceHolder {
        private static final ContainerShipFactory INSTANCE = new ContainerShipFactory();
    }

    public static ContainerShipFactory getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    protected Ship createShip() {
        return new ContainerShip("container", "20T", "green");
    }
}
