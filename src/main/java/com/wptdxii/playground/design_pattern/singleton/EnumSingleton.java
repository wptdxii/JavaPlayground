package com.wptdxii.playground.design_pattern.singleton;

import java.io.Serializable;

public enum EnumSingleton implements Serializable{
    INSTANCE;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode();
    }
}