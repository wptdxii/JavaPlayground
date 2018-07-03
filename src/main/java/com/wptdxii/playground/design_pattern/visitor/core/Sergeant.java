package com.wptdxii.playground.design_pattern.visitor.core;

public class Sergeant extends Unit {

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
    }
}
