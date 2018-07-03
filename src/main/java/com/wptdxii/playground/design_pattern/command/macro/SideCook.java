package com.wptdxii.playground.design_pattern.command.macro;

public class SideCook implements Cook {
    @Override
    public void cook(String dish) {
        System.out.println("Side cook:" + dish);
    }
}
