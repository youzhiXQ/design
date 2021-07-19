package com.company.design.bridge.bag;


import com.company.design.bridge.material.Material;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.factory.bridge.bag
 * @author:Savanna
 * @createTime:2021/7/19 10:03
 * @version:1.0
 */
public abstract class Bag {
    protected Material material;
   public abstract void pack();

    /*public Bag(Material material) {
        this.material = material;
    }*/

    public void setMaterial(Material material) {
        this.material = material;
    }
}
