package com.company.design.factory.abstractfactory.abstractfactory;

import com.company.design.factory.abstractfactory.bag.Bag;
import com.company.design.factory.abstractfactory.fruit.Fruit4;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.abstractfactory
 * @author:Savanna
 * @createTime:2021/7/17 17:16
 * @version:1.0
 */
public abstract class AbstractFactory {

    abstract Fruit4 getFruit();

    abstract Bag getBag();
}
