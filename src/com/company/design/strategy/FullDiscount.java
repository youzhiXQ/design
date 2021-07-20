package com.company.design.strategy;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.strategy
 * @author:Savanna
 * @createTime:2021/7/20 11:44
 * @version:1.0
 */
public class FullDiscount implements Discount {
    @Override
    public int discount(int money) {
        if (money > 100) {
            return money - 20;
        }
        return money;
    }
}
