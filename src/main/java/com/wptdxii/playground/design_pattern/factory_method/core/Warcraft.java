package com.wptdxii.playground.design_pattern.factory_method.core;

public abstract class Warcraft {
    // factory method
    protected abstract Weapon manufacture();

    public void fight() {
        Weapon weapon = manufacture();
        weapon.attack();
    }
}
