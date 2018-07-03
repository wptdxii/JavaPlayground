package com.wptdxii.playground.design_pattern.builder;

import com.wptdxii.playground.design_pattern.builder.core.Builder;
import com.wptdxii.playground.design_pattern.builder.core.ConcreteBuilder;
import com.wptdxii.playground.design_pattern.builder.core.Director;
import com.wptdxii.playground.design_pattern.builder.simple.Hero;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        constructMage(director);
        constructWarrior(director);
        constructThief(director);

        Hero mage = new Hero.Builder("Mage", Profession.MAGE)
                .hairColor(HairColor.BLACK)
                .weapon(Weapon.DAGGER).build();
        System.out.println(mage);

        Hero warrior = new Hero.Builder("Warrior", Profession.WARRIOR)
                .hairColor(HairColor.BLOND)
                .hairStyle(HairStyle.LONG_CURLY)
                .weapon(Weapon.SWORD)
                .armor(Armor.CHAIN_MAIL).build();
        System.out.println(warrior);

        Hero thief = new Hero.Builder("Thief", Profession.THIEF)
                .hairStyle(HairStyle.BALD)
                .weapon(Weapon.BOW).build();
        System.out.println(thief);
    }

    private static void constructMage(Director director) {
        Builder mageBuilder = new ConcreteBuilder("Mage", Profession.MAGE);
        director.setBuilder(mageBuilder);
        director.constructMage();
        System.out.println(mageBuilder.build());
    }

    private static void constructWarrior(Director director) {
        Builder warriorBuilder = new ConcreteBuilder("Warrior", Profession.WARRIOR);
        director.setBuilder(warriorBuilder);
        director.constructWarrior();
        System.out.println(warriorBuilder.build());
    }

    private static void constructThief(Director director) {
        Builder thiefBuilder = new ConcreteBuilder("Thief", Profession.THIEF);
        director.setBuilder(thiefBuilder);
        director.constructThief();
        System.out.println(thiefBuilder.build());
    }
}
