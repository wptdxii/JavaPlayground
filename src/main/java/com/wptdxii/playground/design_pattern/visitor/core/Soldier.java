package com.wptdxii.playground.design_pattern.visitor.core;

public class Soldier extends Unit{

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
    }
}
