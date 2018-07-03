package com.wptdxii.playground.design_pattern.builder.simple;

import com.wptdxii.playground.design_pattern.builder.*;

public final class Hero {
    private final String name;
    private final Profession profession;
    private final Weapon weapon;
    private final Armor armor;
    private final HairStyle hairStyle;
    private final HairColor hairColor;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
        this.hairStyle = builder.hairStyle;
        this.hairColor = builder.hairColor;
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }


    public Weapon getWeapon() {
        return weapon;
    }


    public Armor getArmor() {
        return armor;
    }


    public HairStyle getHairStyle() {
        return hairStyle;
    }


    public HairColor getHairColor() {
        return hairColor;
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

    public static final class Builder {
        private final String name;
        private final Profession profession;
        private Weapon weapon;
        private Armor armor;
        private HairStyle hairStyle;
        private HairColor hairColor;

        public Builder(String name, Profession profession) {
            if (name == null || name.trim().isEmpty() || profession == null) {
                throw new IllegalArgumentException("Hero name can't be null");
            }
            this.name = name;
            this.profession = profession;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder armor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder hairStyle(HairStyle hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }

        public Builder hairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }

}
