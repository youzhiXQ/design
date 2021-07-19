package com.company.design.factory.construction.fruit;

/**
 * 西瓜
 */
public class WaterMelon extends Fruit3 {
    private int price;


    public WaterMelon(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return 0;
    }
}
