package com.wptdxii.playground.design_pattern.null_object;

import com.wptdxii.playground.design_pattern.null_object.core.Node;
import com.wptdxii.playground.design_pattern.null_object.core.NodeFactory;

public class Client {
    public static void main(String[] args) {
        Node node = NodeFactory.createNode("1");
        node.walk();
        node = NodeFactory.createNode(null);
        node.walk();
    }
}
