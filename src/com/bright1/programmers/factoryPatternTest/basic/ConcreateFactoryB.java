package com.bright1.programmers.factoryPatternTest.basic;

public class ConcreateFactoryB extends AbstractFactory{
    @Override
    protected Iproduct createProduct() {
        return new ConcreateProductB();
    }
}
