package com.company.design.agent;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.agent
 * @author:Savanna
 * @createTime:2021/7/19 11:35
 * @version:1.0
 */
public class ProxyOrder implements Order {

    private OutOrder outOrder;

    @Override
    public int saveOrder() {
        return outOrder.saveOrder();
    }
}
