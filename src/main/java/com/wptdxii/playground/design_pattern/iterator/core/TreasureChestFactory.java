package com.wptdxii.playground.design_pattern.iterator.core;

public class TreasureChestFactory {
    private TreasureChestFactory() {
        throw new UnsupportedOperationException("Cant't be instantiated");
    }

    public static TreasureChest create(TreasureChestType treasureChestType) {
        switch (treasureChestType) {
            case LIST:
                return new ListTreasureChest();
            case ARRAY:
                return new ArrayTreasureChest();
            default:
                throw new IllegalArgumentException("TreasureChestType not supported");
        }
    }
}
