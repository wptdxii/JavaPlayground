package com.wptdxii.playground.design_pattern.iterator.core;

import java.util.List;

public class ListTreasureChestIterator implements Iterator<Treasure> {
    private ListTreasureChest treasureChest;
    private TreasureType treasureType;
    private int cursor = -1;

    public ListTreasureChestIterator(ListTreasureChest treasureChest, TreasureType treasureType) {
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
            return treasureChest.getTreasures().get(cursor);
        }
        return null;
    }

    private int findNextIndex() {
        List<Treasure> treasures = treasureChest.getTreasures();
        int index = cursor;
        while (true) {
            index++;
            if (index >= treasures.size()) {
                index = -1;
                break;
            }

            if (TreasureType.ANY.equals(treasureType) || treasureType.equals(treasures.get(index).getTreasureType())) {
                break;
            }
        }
        return index;
    }
}
