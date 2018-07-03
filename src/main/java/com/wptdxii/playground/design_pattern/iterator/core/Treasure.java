package com.wptdxii.playground.design_pattern.iterator.core;

public class Treasure {
    private TreasureType type;
    private String treasure;

    public Treasure(TreasureType type, String treasure) {
        this.type = type;
        this.treasure = treasure;
    }

    public TreasureType getTreasureType() {
        return type;
    }

    public String getTreasure() {
        return treasure;
    }

    @Override
    public String toString() {
        return treasure;
    }
}
