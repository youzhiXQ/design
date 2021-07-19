package com.company.design.factory.easyfactory;

public class Client {

    public static void main(String[] args) {
            //通过工厂方法调用
            EasyFactory.getFruit1(EasyFactory.APPLE);
            //直接调用
            EasyFactory.getApple();

    }
}
