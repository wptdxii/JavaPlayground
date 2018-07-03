package com.wptdxii.playground.design_pattern.builder.core;

import com.wptdxii.playground.design_pattern.builder.*;

public final class Hero {
    private String name;
    private Profession profession;
    private Weapon weapon;
    private Armor armor;
    private HairStyle hairStyle;
    private HairColor hairColor;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    void setArmor(Armor armor) {
        this.armor = armor;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    void setHairStyle(HairStyle hairStyle) {
        this.hairStyle = hairStyle;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);

        if (hairStyle != null || hairColor != null) {
            sb.append(" with ");

            if (hairColor != null) {
                sb.append(hairColor).append(" ");
            }

            if (hairStyle != null) {
                sb.append(hairStyle).append(" ");
            }

            sb.append(hairStyle != HairStyle.BALD ? "hair" : "head");
        }

        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');

        return sb.toString();
    }
}
