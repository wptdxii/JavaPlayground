package com.wptdxii.playground.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton sInstance;

    private LazySingleton() {
        // to prevent multiple instantiating by Reflection call
        if (sInstance != null) {
            throw new UnsupportedOperationException("Already instantiated.");
        }
    }

    public static synchronized LazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingleton();
        }
        return sInstance;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode();
    }
}
