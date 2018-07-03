package com.wptdxii.playground.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class HolderSingleton implements Serializable {
    private HolderSingleton() {
        if (SingletonHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("Already instantiated.");
        }
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode();
    }
}
