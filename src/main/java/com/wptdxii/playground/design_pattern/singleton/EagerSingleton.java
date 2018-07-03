package com.wptdxii.playground.design_pattern.singleton;


import java.io.ObjectStreamException;
import java.io.Serializable;

public class EagerSingleton implements Serializable {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // to prevent multiple instantiating by Reflection call
        if (INSTANCE != null) {
            throw new UnsupportedOperationException("Already instantiated.");
        }
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode();
    }
}
