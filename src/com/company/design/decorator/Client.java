package com.company.design.decorator;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.decorator
 * @author:Savanna
 * @createTime:2021/7/19 11:18
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
        Bag bag = new BigBag();
        bag = new CheckBagDecorator(bag);
    }
}
