package com.wptdxii.playground.design_pattern.null_object.core;

public class NullNode implements Node {
    private NullNode() {
        if (SingletonHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("Already instantiated.");
        }
    }

    public static NullNode getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void walk() {
        // Do nothing
    }

    private static class SingletonHolder {
        private static final NullNode INSTANCE = new NullNode();
    }
}
