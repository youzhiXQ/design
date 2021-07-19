package com.company.design.factory.factorymethod.factory;

import com.company.design.factory.factorymethod.fruit.Fruit2;
import com.company.design.factory.factorymethod.fruit.Straberry;

public class StraberryFactory implements Factory {
    @Override
    public Fruit2 getFruit2() {
        return new Straberry();
    }
}
