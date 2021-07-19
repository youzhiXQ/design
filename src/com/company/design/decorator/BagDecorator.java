package com.company.design.decorator;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.decorator
 * @author:Savanna
 * @createTime:2021/7/19 11:05
 * @version:1.0
 */
public class BagDecorator implements Bag {
    private Bag bag;

    public BagDecorator(Bag bag) {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }

}
