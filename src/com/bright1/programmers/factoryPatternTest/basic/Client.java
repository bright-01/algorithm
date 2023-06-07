package com.bright1.programmers.factoryPatternTest.basic;

public class Client {
    public static void main(String[] args) {
        AbstractFactory[] factories = {
                new ConcreateFactoryA(), new ConcreateFactoryB()
        };

        Iproduct productA = factories[0].createOperation();
        Iproduct productB = factories[1].createOperation();
    }
}
