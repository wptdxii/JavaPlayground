package com.wptdxii.playground.design_pattern.builder;

public enum HairStyle {
    BALD, SHORT, CURLY, LONG_STRAIGHT, LONG_CURLY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
