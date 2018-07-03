package com.wptdxii.playground.design_pattern.object_pool.core;

public class ReusablePool extends ObjectPool<Reusable> {
    private ReusablePool() {
        if (SingletonHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("Already initialized.");
        }
    }

    public static ReusablePool getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ReusablePool INSTANCE = new ReusablePool();
    }

    @Override
    protected Reusable create() {
        return new Reusable();
    }
}
