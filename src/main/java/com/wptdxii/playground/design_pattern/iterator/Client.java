package com.wptdxii.playground.design_pattern.iterator;

import com.wptdxii.playground.design_pattern.iterator.core.*;

public class Client {

    public static void main(String[] args) {
        filter(TreasureChestFactory.create(TreasureChestType.LIST));

        filter(TreasureChestFactory.create(TreasureChestType.ARRAY));
    }

    private static void filter(TreasureChest treasureChest) {
        iterate(treasureChest, TreasureType.ANY);
        iterate(treasureChest, TreasureType.POTION);
        iterate(treasureChest, TreasureType.RING);
        iterate(treasureChest, TreasureType.WEAPON);
    }

    private static void iterate(TreasureChest treasureChest, TreasureType treasureType) {
        Iterator iterator = treasureChest.iterator(treasureType);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
    }
}
