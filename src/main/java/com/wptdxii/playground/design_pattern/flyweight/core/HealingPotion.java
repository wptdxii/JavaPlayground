package com.wptdxii.playground.design_pattern.flyweight.core;

public class HealingPotion implements Potion {
    private PotionType type;

    public HealingPotion(PotionType type) {
        this.type = type;
    }

    @Override
    public void drink(String potion) {
        System.out.println(potion + " will heal you! IntrinsicState : " + type.name().toLowerCase() + " HashCode = " + hashCode());
    }
}
