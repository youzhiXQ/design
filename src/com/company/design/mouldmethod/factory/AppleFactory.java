package com.company.design.mouldmethod.factory;

import com.company.design.mouldmethod.fruit.Apple;
import com.company.design.mouldmethod.fruit.Fruit;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.mouldmethod.factory
 * @author:Savanna
 * @createTime:2021/7/20 11:33
 * @version:1.0
 */
public class AppleFactory implements  Factory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
