package com.company.design.chain;

import com.company.design.strategy.Discount;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.chain
 * @author:Savanna
 * @createTime:2021/7/20 13:48
 * @version:1.0
 */
public abstract class MultyDiscount implements Discount {
    private MultyDiscount nextMultyDiscount;

    public MultyDiscount(MultyDiscount nextMultyDiscount) {
        this.nextMultyDiscount = nextMultyDiscount;
    }

    public abstract int pay(int money);

}
