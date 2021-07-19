package com.company.design.factory.abstractfactory.abstractfactory;

import com.company.design.factory.abstractfactory.bag.Bag;
import com.company.design.factory.abstractfactory.bag.BlueBerryBag;
import com.company.design.factory.abstractfactory.fruit.BlueBerry;
import com.company.design.factory.abstractfactory.fruit.Fruit4;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.abstractfactory
 * @author:Savanna
 * @createTime:2021/7/17 17:17
 * @version:1.0
 */
public class BlueBerryBagFactory2 extends AbstractFactory {
    @Override
    Fruit4 getFruit() {
        return new BlueBerry();
    }

    @Override
    Bag getBag() {
        return new BlueBerryBag();
    }

}
