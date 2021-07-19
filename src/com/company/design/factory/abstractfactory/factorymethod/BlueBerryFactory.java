package com.company.design.factory.abstractfactory.factorymethod;

import com.company.design.factory.abstractfactory.fruit.BlueBerry;
import com.company.design.factory.abstractfactory.fruit.Fruit4;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.factorymethod
 * @author:Savanna
 * @createTime:2021/7/17 16:37
 * @version:1.0
 */
public class BlueBerryFactory implements  FruitFactory{
    @Override
    public Fruit4 getFruit() {
        return new BlueBerry();
    }
}
