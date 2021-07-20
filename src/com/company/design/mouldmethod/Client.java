package com.company.design.mouldmethod;

import com.company.design.mouldmethod.factory.AppleFactory;
import com.company.design.mouldmethod.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 模板方法模式
 * @projectName:design
 * @see:com.company.design.mouldmethod
 * @author:Savanna
 * @createTime:2021/7/20 11:30
 * @version:1.0
 */
public class Client {

    public static void main(String[] args) {
        List<Fruit> product = new ArrayList<>();
        product.add(new AppleFactory().getFruit());
        ShoppingCart shoppingCart = new CashShoppingCart(product);
        shoppingCart.pay(10);
    }
}
