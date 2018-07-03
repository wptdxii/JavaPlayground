package com.wptdxii.playground.design_pattern.facade.core;

public class DwarvenCartOperator extends DwarvenMineWorker{
    @Override
    public String name() {
        return "Dwarf cart operator";
    }

    @Override
    public void work() {
        System.out.println(name() + " moves the gold chunks out of the mine.");
    }
}
