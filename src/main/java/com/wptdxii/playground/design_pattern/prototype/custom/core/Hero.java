package com.wptdxii.playground.design_pattern.prototype.custom.core;

public class Hero implements Prototype<Hero> {
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
    public Hero clone() {
        return new Hero(name, weapon.clone());
    }

    @Override
    public String toString() {
        return "This is a hero named " + name + " with " + weapon;
    }
}
