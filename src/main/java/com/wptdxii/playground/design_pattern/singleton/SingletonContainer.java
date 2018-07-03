package com.wptdxii.playground.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SingletonContainer implements Serializable{
    private static Map<String, Object> containerMap = new HashMap<>();

    private SingletonContainer() {
    }

    public static void putInstance(String key, Object instance) {
        if (!containerMap.containsKey(key)) {
            containerMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return containerMap.get(key);
    }

    private Object readResolve() throws ObjectStreamException {
        return this;
    }
}
