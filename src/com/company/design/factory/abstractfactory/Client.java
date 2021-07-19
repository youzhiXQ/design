package com.company.design.factory.abstractfactory;


/**
 * @description: 同一个类 全部都需要加 static
 * @projectName:jdk
 * @see:com.company.design.factory.abstractfactory
 * @author:Savanna
 * @createTime:2021/7/17 17:36
 * @version:1.0
 */
public class Client {
    //父类
    static abstract class Bag2 {
        abstract void pack();
    }

    //子类继承
    static class AppleBag extends Bag2 {
        @Override
        void pack() {

        }
    }

    public static void main(String[] args) {
        toPack();
    }

    private static void toPack() {
        Bag2 bag2 = new AppleBag();
        bag2.pack();
    }
}
