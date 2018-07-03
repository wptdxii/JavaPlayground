package com.wptdxii.playground.design_pattern.visitor.core;

public class SoldierVisitor implements UnitVisitor{
    @Override
    public void visit(Commander commander) {
        // Do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visit(Soldier soldier) {
        System.out.println("Greetings " + soldier);
    }
}
