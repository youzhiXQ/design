package com.company.design.bridge;

import com.company.design.bridge.bag.Bag;
import com.company.design.bridge.bag.BigBag;
import com.company.design.bridge.material.Material;
import com.company.design.bridge.material.Paper;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.bridge
 * @author:Savanna
 * @createTime:2021/7/19 10:07
 * @version:1.0
 */
public class Client {

    public static void main(String[] args) {
        Bag bag = new BigBag();
        Material material = new Paper();
        bag.setMaterial(material);
        bag.pack();
    }
}
