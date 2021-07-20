package com.company.design.mouldmethod;

import com.company.design.mouldmethod.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @projectName:design
 * @see:com.company.design.mouldmethod
 * @author:Savanna
 * @createTime:2021/7/20 11:19
 * @version:1.0
 */
public abstract class ShoppingCart {
    List<Fruit> product = new ArrayList<>();

    public ShoppingCart(List<Fruit> product) {
        this.product = product;
    }

    protected abstract void pay(int money);
}
