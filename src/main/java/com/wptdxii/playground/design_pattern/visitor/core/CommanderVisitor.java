package com.wptdxii.playground.design_pattern.visitor.core;

public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you " + commander);
    }

    @Override
    public void visit(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visit(Soldier soldier) {
        // Do nothing
    }
}
