package com.wptdxii.playground.design_pattern.prototype.custom.core;

public class Weapon implements Prototype<Weapon> {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public Weapon clone() {
        return new Weapon(weaponType);
    }

    @Override
    public String toString() {
        return weaponType.name().toLowerCase();
    }
}
