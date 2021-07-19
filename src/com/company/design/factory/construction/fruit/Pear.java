package com.company.design.factory.construction.fruit;


/**
 * 梨子
 */
public class Pear extends Fruit3 {
    //private int price;
    public int price;

    public Pear() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int price() {
        return 2;
    }
}
