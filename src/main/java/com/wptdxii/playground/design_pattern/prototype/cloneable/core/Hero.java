package com.wptdxii.playground.design_pattern.prototype.cloneable.core;


public class Hero extends Prototype<Hero> {
    private String name;
    private Weapon weapon;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getWeapon() {
        return weapon.getWeaponType();
    }

    public void setWeapon(WeaponType weaponType) {
        this.weapon.setWeaponType(weaponType);
    }

    @Override
    public Hero clone() throws CloneNotSupportedException {
        Hero hero = super.clone();
        hero.name = name;
        hero.weapon = weapon.clone();
        return hero;
    }

    @Override
    public String toString() {
        return "This is a hero named " + name + " with " + weapon;
    }
}
