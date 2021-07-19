package com.company.design.bridge.bag;


/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.bridge.bag
 * @author:Savanna
 * @createTime:2021/7/19 10:05
 * @version:1.0
 */
public class BigBag extends Bag {

    @Override
    public void pack() {
        this.material.material();
    }
}
