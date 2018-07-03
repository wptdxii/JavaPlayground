package com.wptdxii.playground.design_pattern.visitor;

import com.wptdxii.playground.design_pattern.visitor.core.CommanderVisitor;
import com.wptdxii.playground.design_pattern.visitor.core.SergeantVisitor;
import com.wptdxii.playground.design_pattern.visitor.core.SoldierVisitor;
import com.wptdxii.playground.design_pattern.visitor.core.UnitStructure;

public class Client {
    public static void main(String[] args) {
        UnitStructure structure = new UnitStructure();
        structure.accept(new CommanderVisitor());
        structure.accept(new SergeantVisitor());
        structure.accept(new SoldierVisitor());
    }
}
