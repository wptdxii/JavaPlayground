package com.wptdxii.playground.design_pattern.visitor.core;

public abstract class Unit {

    public abstract void accept(UnitVisitor visitor);

    @Override
    public String toString() {
        return getClass().getSimpleName().toLowerCase();
    }
}
