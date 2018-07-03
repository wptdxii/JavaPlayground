package com.wptdxii.playground.design_pattern.visitor.core;


public interface UnitVisitor {
    void visit(Commander commander);

    void visit(Sergeant sergeant);

    void visit(Soldier soldier);
}
