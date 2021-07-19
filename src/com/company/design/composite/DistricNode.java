package com.company.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.composite
 * @author:Savanna
 * @createTime:2021/7/19 13:31
 * @version:1.0
 */
public class DistricNode extends Node {
    private List<Node> child = new ArrayList<>();

    public DistricNode(String name) {
        super(name);
    }

    /*@Override
    List<Node> getChild() {
        return child;
    }*/

    void addChild(Node node) {
        child.add(node);
    }

    void delChild(int i) {
        child.remove(i);
    }

    @Override
    public String toString() {
        return "DistricNode{" +
                "child=" + child +
                '}';
    }
}
