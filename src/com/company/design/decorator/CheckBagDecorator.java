package com.company.design.decorator;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.decorator
 * @author:Savanna
 * @createTime:2021/7/19 11:13
 * @version:1.0
 */
public class CheckBagDecorator extends BagDecorator {
    public CheckBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();
        this.check();
    }

    private void check() {

    }
}
