package com.wptdxii.playground.design_pattern.bridge.core;

public class Sword implements Weapon {
    private Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        enchantment.apply();
        stab();
    }

    @Override
    public void unwield() {
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }

    public void stab() {
        System.out.println("Stab with a sword.");
    }
}
