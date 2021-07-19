package com.company.design.factory.factorymethod;

import com.company.design.factory.factorymethod.factory.Factory;
import com.company.design.factory.factorymethod.factory.StraberryFactory;

public class Client {

    public static void main(String[] args) {
        Factory factory=new StraberryFactory();
        factory.getFruit2();
    }
}
