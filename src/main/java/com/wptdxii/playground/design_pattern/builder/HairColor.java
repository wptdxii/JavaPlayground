package com.wptdxii.playground.design_pattern.builder;

public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
