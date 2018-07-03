package com.wptdxii.playground.design_pattern.strategy.core;

public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Sever the dragon's head in he melee!");
    }
}
