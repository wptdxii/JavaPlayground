package com.wptdxii.playground.design_pattern.prototype.cloneable.core;

public abstract class Prototype<T> implements Cloneable {
    @Override
    protected T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
