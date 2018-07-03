package com.wptdxii.playground.design_pattern.visitor.core;

import java.util.ArrayList;
import java.util.List;

public class UnitStructure {
    private List<Unit> units = new ArrayList<>();

    public UnitStructure() {
        units.add(new Commander());
        units.add(new Sergeant());
        units.add(new Sergeant());
        units.add(new Soldier());
        units.add(new Soldier());
        units.add(new Soldier());
        units.add(new Soldier());
        units.add(new Soldier());
        units.add(new Soldier());
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void accept(UnitVisitor visitor) {
        for (Unit unit : units) {
            unit.accept(visitor);
        }
    }
}
