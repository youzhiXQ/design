package com.company.design.strategy;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.strategy
 * @author:Savanna
 * @createTime:2021/7/20 11:44
 * @version:1.0
 */
public class SecondDiscount implements Discount {
    @Override
    public int discount(int money) {
        if (money > 400) {
            money -= money * 0.9;
            return money;
        } else if (money > 200) {
            Double moneys = money * 0.9;
            return moneys.intValue();
        }
        return money;
    }
}
