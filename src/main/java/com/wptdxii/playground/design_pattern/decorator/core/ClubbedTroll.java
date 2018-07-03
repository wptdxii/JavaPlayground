package com.wptdxii.playground.design_pattern.decorator.core;

public class ClubbedTroll extends TrollDecorator {
    public ClubbedTroll(Troll troll) {
        super(troll);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 10;
    }
}
