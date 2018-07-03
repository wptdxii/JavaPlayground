package com.wptdxii.playground.design_pattern.builder.core;

import com.wptdxii.playground.design_pattern.builder.*;

public class ConcreteBuilder implements Builder {
    private Hero hero;

    public ConcreteBuilder(String name, Profession profession) {
        if (name == null || name.trim().isEmpty() || profession == null) {
            throw new IllegalArgumentException("Hero name can't be null");
        }

        hero = new Hero();
        hero.setName(name);
        hero.setProfession(profession);
    }

    @Override
    public void buildProfession(Profession profession) {
        hero.setProfession(profession);
    }

    @Override
    public void buildWeapon(Weapon weapon) {
        hero.setWeapon(weapon);
    }

    @Override
    public void buildArmor(Armor armor) {
        hero.setArmor(armor);
    }

    @Override
    public void buildHairStyle(HairStyle hairStyle) {
        hero.setHairStyle(hairStyle);
    }

    @Override
    public void buildHairColor(HairColor hairColor) {
        hero.setHairColor(hairColor);
    }

    @Override
    public Hero build() {
        return hero;
    }
}
