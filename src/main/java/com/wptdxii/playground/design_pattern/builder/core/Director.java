package com.wptdxii.playground.design_pattern.builder.core;

import com.wptdxii.playground.design_pattern.builder.*;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructMage() {
        builder.buildHairColor(HairColor.BLACK);
        builder.buildWeapon(Weapon.DAGGER);
    }

    public void constructWarrior() {
        builder.buildHairColor(HairColor.BLOND);
        builder.buildHairStyle(HairStyle.LONG_CURLY);
        builder.buildArmor(Armor.CHAIN_MAIL);
        builder.buildWeapon(Weapon.SWORD);
    }

    public void constructThief() {
        builder.buildHairStyle(HairStyle.BALD);
        builder.buildWeapon(Weapon.BOW);
    }
}
