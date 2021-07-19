package com.company.design.factory.abstractfactory.factorymethod;

import com.company.design.factory.abstractfactory.bag.Bag;
import com.company.design.factory.abstractfactory.bag.BlueBerryBag;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.factorymethod
 * @author:Savanna
 * @createTime:2021/7/17 17:04
 * @version:1.0
 */
public class BlueBerryBagFactory implements  BagFactory {
    @Override
    public Bag toPack() {
        return new BlueBerryBag();
    }
}
