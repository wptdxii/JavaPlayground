package com.wptdxii.playground.design_pattern.object_pool.core;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {
    private Set<T> availableSet = new HashSet<>();
    private Set<T> inUseSet = new HashSet<>();

    protected abstract T create();

    public synchronized T require() {
        if (availableSet.isEmpty()) {
            availableSet.add(create());
        }

        T instance = availableSet.iterator().next();
        availableSet.remove(instance);
        inUseSet.add(instance);
        return instance;
    }

    public synchronized void release(T instance) {
        inUseSet.remove(instance);
        availableSet.add(instance);
    }

    @Override
    public synchronized String toString() {
        return String.format("Object Poll available=%d inUse=%d", availableSet.size(), inUseSet.size());
    }
}
