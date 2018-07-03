package com.wptdxii.playground.design_pattern.builder.core;

import com.wptdxii.playground.design_pattern.builder.*;

public interface Builder {
    void buildProfession(Profession profession);

    void buildWeapon(Weapon weapon);

    void buildArmor(Armor armor);

    void buildHairStyle(HairStyle hairStyle);

    void buildHairColor(HairColor hairColor);

    Hero build();
}
