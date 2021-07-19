package com.company.design.composite;

import java.util.List;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.composite
 * @author:Savanna
 * @createTime:2021/7/19 13:28
 * @version:1.0
 */
public abstract class Node {
    private String name;

//    abstract List<Node> getChild();

    public Node(String name) {
        this.name = name;
    }

 /*   public String getName() {
        return name;
    }*/
}
