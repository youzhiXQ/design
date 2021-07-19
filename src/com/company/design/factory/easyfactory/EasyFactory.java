package com.company.design.factory.easyfactory;

import com.company.design.factory.easyfactory.fruit.Apple;
import com.company.design.factory.easyfactory.fruit.Fruit;
import com.company.design.factory.easyfactory.fruit.Orange;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂
 * 只是针对水果进行 切分 统一
 */
public class EasyFactory {
    //水果类型
    public static final int APPLE = 1;
    public static final int ORANGE = 2;


    //或者直接定义调用
    public static Fruit getApple() {
        return new Apple();
    }
    //或者直接定义调用
    public static Fruit getOrange() {
        return new Orange(40);
    }

    /**
     * 获得水果
     * 法一：
     *
     * @param type
     */
    public static Fruit getFruit1(int type) {
        if (type == APPLE) {
            return new Apple();
        } else if (type == ORANGE) {
            return new Orange(10);
        }
        return null;
    }

    /**
     * 获得水果
     * 法二：
     *
     * @param type
     * @return
     */
    public static Fruit getFruit2(int type) {
        Fruit fruit = null;
        switch (type) {
            case APPLE:
                fruit = new Apple();
                break;
            case ORANGE:
                fruit = new Orange(20);
                break;
        }
        return fruit;
    }

    /**
     * 获得水果
     * 法三
     */
    private static final Map<Integer, Fruit> map = new HashMap<>();

    static {
        map.put(1, new Apple());
        map.put(2, new Orange(30));
    }

    public static Fruit getFruit3(int type) {
        //再此判断type是否再集合中
        return map.get(type);
    }


}
