package com.wptdxii.playground.design_pattern.decorator.core;

public class FlyingTroll extends TrollDecorator {
    public FlyingTroll(Troll troll) {
        super(troll);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The troll is flying!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 20;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll win the battle!");
    }
}
