package com.wptdxii.playground.design_pattern.command.macro;

public class MainCook implements Cook {
    @Override
    public void cook(String dish) {
        System.out.println("Main dish:" + dish);
    }
}
