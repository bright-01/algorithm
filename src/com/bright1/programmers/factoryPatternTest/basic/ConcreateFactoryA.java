package com.bright1.programmers.factoryPatternTest.basic;

public class ConcreateFactoryA extends AbstractFactory{
    @Override
    protected Iproduct createProduct() {
        return new ConcreateProductA();
    }

}
