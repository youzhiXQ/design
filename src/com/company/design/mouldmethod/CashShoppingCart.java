package com.company.design.mouldmethod;

import com.company.design.mouldmethod.fruit.Fruit;

import java.util.List;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.mouldmethod
 * @author:Savanna
 * @createTime:2021/7/20 11:21
 * @version:1.0
 */
public class CashShoppingCart extends  ShoppingCart{

    public CashShoppingCart(List<Fruit> product) {
        super(product);
    }

    @Override
    protected void pay(int money) {

    }

}
