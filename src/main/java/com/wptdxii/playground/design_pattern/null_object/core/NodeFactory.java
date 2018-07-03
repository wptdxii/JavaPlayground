package com.wptdxii.playground.design_pattern.null_object.core;

public class NodeFactory {
    private NodeFactory() {
        throw new UnsupportedOperationException("Can't instantiated.");
    }

    public static Node createNode(String name) {
        if (name == null || name.trim().isEmpty()) {
            return NullNode.getInstance();
        }
        return new NodeImpl(name);
    }
}
