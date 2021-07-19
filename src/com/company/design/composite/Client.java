package com.company.design.composite;

/**
 * @description:
 * @projectName:jdk
 * @see:com.company.design.composite
 * @author:Savanna
 * @createTime:2021/7/19 15:23
 * @version:1.0
 */
public class Client {

    public static void main(String[] args) {
        DistricNode districNode = new DistricNode("根节点");
        districNode.addChild(new DistricNode("北京"));
        DistricNode districNode1 = new DistricNode("上海");
        districNode.addChild(districNode1);
        districNode.addChild(new DistricNode("深圳"));

        districNode1.addChild(new DistricNode("闵行"));
        districNode1.addChild(new DistricNode("浦东"));
        districNode1.addChild(new DistricNode("静安"));

        System.out.println(districNode);
    }
}
