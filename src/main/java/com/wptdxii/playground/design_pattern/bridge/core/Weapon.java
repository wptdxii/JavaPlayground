package com.wptdxii.playground.design_pattern.bridge.core;

public interface Weapon {
    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
