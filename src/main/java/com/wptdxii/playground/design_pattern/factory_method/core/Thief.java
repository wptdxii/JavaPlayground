package com.wptdxii.playground.design_pattern.factory_method.core;

public class Thief extends Warcraft {
    @Override
    protected Weapon manufacture() {
        return new Bow();
    }
}
