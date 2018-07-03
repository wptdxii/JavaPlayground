package com.wptdxii.playground.design_pattern.facade.core;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public String name() {
        return "Dwarf tunnel digger";
    }

    @Override
    public void work() {
        System.out.println(name() + " creates another promising tunnel.");
    }
}
