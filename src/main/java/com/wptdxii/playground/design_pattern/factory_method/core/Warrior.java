package com.wptdxii.playground.design_pattern.factory_method.core;

public class Warrior extends Warcraft{
    @Override
    protected Weapon manufacture() {
        return new Sword();
    }
}
