package com.wptdxii.playground.design_pattern.null_object.core;

public class NodeImpl implements Node {
    private String name;

    public NodeImpl(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Node name:" + name);
    }
}
