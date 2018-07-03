package com.wptdxii.playground.design_pattern.prototype.cloneable;


import com.wptdxii.playground.design_pattern.prototype.cloneable.core.*;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hero hero = new Hero("Thief", new Weapon(WeaponType.BOW));
        System.out.println(hero);

        Hero newHero = hero.clone();
        System.out.println(newHero);

        newHero.setName("Warrior");
        newHero.setWeapon(WeaponType.SWORD);
        System.out.println(newHero);

        System.out.println(hero);
    }
}
