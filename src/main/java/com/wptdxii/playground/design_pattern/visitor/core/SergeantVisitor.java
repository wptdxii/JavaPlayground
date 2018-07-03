package com.wptdxii.playground.design_pattern.visitor.core;

public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visit(Commander commander) {
        // Do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Hello " + sergeant);
    }

    @Override
    public void visit(Soldier soldier) {
        // Do nothing
    }
}
