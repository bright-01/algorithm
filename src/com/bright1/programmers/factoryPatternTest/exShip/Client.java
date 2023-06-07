package com.bright1.programmers.factoryPatternTest.exShip;

public class Client {
    public static void main(String[] args) {
        Ship containerShip = ContainerShipFactory.getInstance().orderShip("tetst");
        Ship oiltankerShip = OilTankerShipFactory.getInstance().orderShip("test");
    }
}
