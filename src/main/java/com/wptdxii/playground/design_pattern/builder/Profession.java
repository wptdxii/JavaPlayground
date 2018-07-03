package com.wptdxii.playground.design_pattern.builder;

public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
