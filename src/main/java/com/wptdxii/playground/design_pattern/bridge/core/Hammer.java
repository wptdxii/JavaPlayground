package com.wptdxii.playground.design_pattern.bridge.core;

public class Hammer implements Weapon {
    private Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        enchantment.apply();
        hit();
    }

    @Override
    public void unwield() {
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }

    public void hit() {
        System.out.println("Hit with a hammer.");
    }
}

