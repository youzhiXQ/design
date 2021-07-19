package com.company.design.factory.abstractfactory.factorymethod;

import com.company.design.factory.abstractfactory.bag.Bag;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.factorymethod
 * @author:Savanna
 * @createTime:2021/7/17 17:05
 * @version:1.0
 */
public interface BagFactory {
    Bag toPack();
}
