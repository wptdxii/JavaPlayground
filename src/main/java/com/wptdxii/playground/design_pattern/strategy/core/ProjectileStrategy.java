package com.wptdxii.playground.design_pattern.strategy.core;

public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Shoot the dragon with the magical crossbow!");
    }
}
