package com.wptdxii.playground.design_pattern.singleton;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Broken under JDK 1.4
 */
public class DCLSingleton implements Serializable {
    private static volatile DCLSingleton sInstance;

    /**
     * private constructor to prevent client from instantiating.
     */
    private DCLSingleton() {
        // to prevent multiple instantiating by Reflection call
        if (sInstance != null) {
            throw new UnsupportedOperationException("Already instantiated");
        }
    }

    public static DCLSingleton getInstance() {
        // use local variable to increase performance
        DCLSingleton result = sInstance;
        if (result == null) {
            synchronized (DCLSingleton.class) {
                // Again assign the instance to local variable to check if it was initialized by some other thread
                // while current thread was blocked to enter the locked zone.
                result = sInstance;
                if (result == null) {
                    sInstance = result = new DCLSingleton();
                }
            }
        }
        return result;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode();
    }
}
