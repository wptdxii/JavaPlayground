package com.wptdxii.playground.design_pattern.facade.core;

public class DwarvenGoldDigger extends DwarvenMineWorker{
    @Override
    public String name() {
        return "Dwarf gold digger";
    }

    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }
}
