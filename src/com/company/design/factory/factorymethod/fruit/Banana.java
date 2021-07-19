package com.company.design.factory.factorymethod.fruit;

public class Banana extends Fruit2 {
    private int  price;

    public Banana(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }
}
