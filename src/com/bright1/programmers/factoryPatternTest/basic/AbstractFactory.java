package com.bright1.programmers.factoryPatternTest.basic;

abstract class AbstractFactory {
    final Iproduct createOperation() {
        Iproduct product = createProduct();
        product.setting();
        return product;
    }

    abstract protected Iproduct createProduct();
}
