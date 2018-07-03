package com.wptdxii.playground.design_pattern.decorator.core;

public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 0;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
