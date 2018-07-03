package com.wptdxii.playground.design_pattern.iterator.core;

public class ArrayTreasureChest implements TreasureChest {
    private Treasure[] treasures;

    public ArrayTreasureChest() {
        treasures = new Treasure[10];
        treasures[0] = new Treasure(TreasureType.POTION, "Potion of courage");
        treasures[1] = new Treasure(TreasureType.RING, "Ring of shadows");
        treasures[2] = new Treasure(TreasureType.POTION, "Potion of wisdom");
        treasures[3] = new Treasure(TreasureType.POTION, "Potion of blood");
        treasures[4] = new Treasure(TreasureType.WEAPON, "Sword of silver +1");
        treasures[5] = new Treasure(TreasureType.POTION, "Potion of rust");
        treasures[6] = new Treasure(TreasureType.RING, "Ring of armor");
        treasures[7] = new Treasure(TreasureType.WEAPON, "Steel halberd");
        treasures[8] = new Treasure(TreasureType.WEAPON, "Dagger of poison");
        treasures[9] = new Treasure(TreasureType.POTION, "Potion of healing");
    }

    @Override
    public Iterator iterator(TreasureType treasureType) {
        return new ArrayTreasureChestIterator(this, treasureType);
    }

    public Treasure[] getTreasures() {
        return treasures;
    }
}
