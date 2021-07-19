package com.company.design.factory.abstractfactory.factorymethod;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.factorymethod
 * @author:Savanna
 * @createTime:2021/7/17 16:37
 * @version:1.0
 */
public class Client {
    private static FruitFactory fruitFactory;
    private static BagFactory bagFactory;

    public static void main(String[] args) {
        pack();
    }

    private static void pack() {
        //工厂方法  各搞各的
        //1、水果工厂
        fruitFactory = new BlueBerryFactory();
        fruitFactory.getFruit();
        //2、水果包装工厂
        bagFactory = new BlueBerryBagFactory();
        bagFactory.toPack();
    }
}
