package com.wptdxii.playground.design_pattern.iterator.core;

import java.util.ArrayList;
import java.util.List;

public class ListTreasureChest implements TreasureChest {
    private List<Treasure> treasures;

    public ListTreasureChest() {
        treasures = new ArrayList<>();
        treasures.add(new Treasure(TreasureType.POTION, "Potion of courage"));
        treasures.add(new Treasure(TreasureType.RING, "Ring of shadows"));
        treasures.add(new Treasure(TreasureType.POTION, "Potion of wisdom"));
        treasures.add(new Treasure(TreasureType.POTION, "Potion of blood"));
        treasures.add(new Treasure(TreasureType.WEAPON, "Sword of silver +1"));
        treasures.add(new Treasure(TreasureType.POTION, "Potion of rust"));
        treasures.add(new Treasure(TreasureType.RING, "Ring of armor"));
        treasures.add(new Treasure(TreasureType.WEAPON, "Steel halberd"));
        treasures.add(new Treasure(TreasureType.WEAPON, "Dagger of poison"));
        treasures.add(new Treasure(TreasureType.POTION, "Potion of healing"));
    }

    @Override
    public Iterator iterator(TreasureType treasureType) {
        return new ListTreasureChestIterator(this, treasureType);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }
}
