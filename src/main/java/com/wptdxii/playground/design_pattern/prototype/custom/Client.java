package com.wptdxii.playground.design_pattern.prototype.custom;

import com.wptdxii.playground.design_pattern.prototype.custom.core.Hero;
import com.wptdxii.playground.design_pattern.prototype.custom.core.Weapon;
import com.wptdxii.playground.design_pattern.prototype.custom.core.WeaponType;

public class Client {
    public static void main(String[] args) {
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
