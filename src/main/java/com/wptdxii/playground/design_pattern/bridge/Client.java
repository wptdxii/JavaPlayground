package com.wptdxii.playground.design_pattern.bridge;

import com.wptdxii.playground.design_pattern.bridge.core.*;

public class Client {
    public static void main(String[] args) {
        Sword flyingSword = new Sword(new FlyingEnchantment());
        invoke(flyingSword);

        Sword soulEatingSword = new Sword(new SoulEatingEnchantment());
        invoke(soulEatingSword);

        Hammer flyingHammer = new Hammer(new FlyingEnchantment());
        invoke(flyingHammer);

        Hammer soulEatingHammer = new Hammer(new SoulEatingEnchantment());
        invoke(soulEatingHammer);
    }

    private static void invoke(Weapon weapon) {
        weapon.wield();
        weapon.swing();
        weapon.unwield();
    }
}
