package com.wptdxii.playground.design_pattern.iterator.core;

public class ArrayTreasureChestIterator implements Iterator<Treasure> {
    private ArrayTreasureChest treasureChest;
    private TreasureType treasureType;
    private int cursor = -1;

    public ArrayTreasureChestIterator(ArrayTreasureChest treasureChest, TreasureType treasureType) {
        this.treasureChest = treasureChest;
        this.treasureType = treasureType;
    }

    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    @Override
    public Treasure next() {
        cursor = findNextIndex();
        if (cursor != -1) {
            return treasureChest.getTreasures()[cursor];
        }
        return null;
    }

    private int findNextIndex() {
        Treasure[] treasures = treasureChest.getTreasures();
        int index = cursor;
        while (true) {
            index++;
            if (index >= treasures.length) {
                index = -1;
                break;
            }

            if (TreasureType.ANY.equals(treasureType) || treasureType.equals(treasures[index].getTreasureType())) {
                break;
            }
        }
        return index;
    }
}
