package com.company.design.factory.construction.builder;

import com.company.design.factory.construction.fruit.FruitMeal;
import com.company.design.factory.construction.fruit.Pear;
import com.company.design.factory.construction.fruit.WaterMelon;

public class NewCustomerBuilder implements Builder {

    FruitMeal fruitMeal = new FruitMeal();

    @Override
    public void buildPear(int price) {
        Pear pear = new Pear();
        pear.setPrice(price);
        fruitMeal.setPear(pear);
    }

    @Override
    public void buildWaterMelon(int price) {
        WaterMelon waterMelon = new WaterMelon(price);
        fruitMeal.setWaterMelon(waterMelon);
    }

    @Override
    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(10);
        return fruitMeal;
    }
}
