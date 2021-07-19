package com.company.design.agent;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.agent
 * @author:Savanna
 * @createTime:2021/7/19 11:42
 * @version:1.0
 */
public class Client {

    public static void main(String[] args) {
        Order order = new ProxyOrder();
        order.saveOrder();
    }
}
