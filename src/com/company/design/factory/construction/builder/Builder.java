package com.company.design.factory.construction.builder;

import com.company.design.factory.construction.fruit.FruitMeal;

public interface Builder {

    void buildPear(int price);

    void buildWaterMelon(int price);

    FruitMeal getFruitMeal();

}
