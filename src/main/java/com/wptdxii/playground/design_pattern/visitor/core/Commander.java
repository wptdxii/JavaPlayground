package com.wptdxii.playground.design_pattern.visitor.core;

public class Commander extends Unit {

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
    }
}
