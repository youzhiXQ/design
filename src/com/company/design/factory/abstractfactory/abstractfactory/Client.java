package com.company.design.factory.abstractfactory.abstractfactory;

import com.company.design.factory.abstractfactory.bag.Bag;
import com.company.design.factory.abstractfactory.fruit.Fruit4;

/**
 * @description: 不同的类 就是 方法名前面加 static  其他的类不需要加
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory.abstractfactory
 * @author:Savanna
 * @createTime:2021/7/17 17:18
 * @version:1.0
 */
public class Client {

    private static AbstractFactory abstractFactory;

    public static void main(String[] args) {
        pack();
    }

    private static void pack() {
        abstractFactory = new BlueBerryBagFactory2();
        Fruit4 fruit = abstractFactory.getFruit();
        Bag bag = abstractFactory.getBag();
        //如果是抽象类 那么这里点不出来方法  改成public的方法就可以了
        //JDK 1.8以前，抽象类的方法默认访问权限为protected
        //JDK 1.8时，抽象类的方法默认访问权限变为default
        bag.pack();

        //不使用里氏替换原则
        BlueBerryBagFactory2 blueBerryBagFactory2 = new BlueBerryBagFactory2();
        Bag bag1 = blueBerryBagFactory2.getBag();
        bag1.pack();
    }


}
