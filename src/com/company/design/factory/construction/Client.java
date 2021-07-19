package com.company.design.factory.construction;

import com.company.design.factory.construction.builder.Builder;
import com.company.design.factory.construction.builder.OldCustomeBuilder;

public class Client {

    public static void main(String[] args) {
        Builder builder=new OldCustomeBuilder();
        builder.buildPear(10);
        builder.buildWaterMelon(25);

        builder.getFruitMeal();

    }
}
