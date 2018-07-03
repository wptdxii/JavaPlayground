package com.wptdxii.playground.design_pattern.flyweight.core;

public class PoisonPotion implements Potion {
    private PotionType type;

    public PoisonPotion(PotionType type) {
        this.type = type;
    }

    @Override
    public void drink(String potion) {
        System.out.println(potion + " will hurt you! IntrinsicState : " + type.name().toLowerCase() + " HashCode = " + hashCode());
    }
}
