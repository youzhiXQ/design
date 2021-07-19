package com.company.design.factory.factorymethod.factory;

import com.company.design.factory.factorymethod.fruit.Banana;
import com.company.design.factory.factorymethod.fruit.Fruit2;

public class BananaFactory  implements  Factory{
    @Override
    public Fruit2 getFruit2() {
        return new Banana(10);
    }
}
