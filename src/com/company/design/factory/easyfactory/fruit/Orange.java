package com.company.design.factory.easyfactory.fruit;


/**
 * 橘子
 */
public class Orange extends Fruit {

    private int price;

    public Orange(int price) {
        this.price = price;
    }


    @Override
    public int price() {
        return 0;
    }
}
