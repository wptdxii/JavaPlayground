package com.wptdxii.playground.design_pattern.prototype.cloneable.core;


public class Weapon extends Prototype<Weapon> {
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
    protected Weapon clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return weaponType.name().toLowerCase();
    }
}
