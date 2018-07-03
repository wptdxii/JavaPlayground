package com.wptdxii.playground.design_pattern.decorator.core;

public abstract class TrollDecorator implements Troll {
    private Troll troll;

    public TrollDecorator(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
    }

    @Override
    public int getAttackPower() {
        return troll.getAttackPower();
    }

    @Override
    public void fleeBattle() {
        troll.fleeBattle();
    }
}
