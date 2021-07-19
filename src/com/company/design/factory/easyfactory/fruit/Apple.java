package com.company.design.factory.easyfactory.fruit;

/**
 * 苹果
 */
public class Apple extends Fruit {

    private int price;


    public Apple() {
    }


    public Apple(int price) {
        this.price = price;
    }


    @Override
    public int price() {
        return 0;
    }
}
