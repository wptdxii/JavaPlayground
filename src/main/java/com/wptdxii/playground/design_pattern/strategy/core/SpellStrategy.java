package com.wptdxii.playground.design_pattern.strategy.core;

public class SpellStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("Cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
