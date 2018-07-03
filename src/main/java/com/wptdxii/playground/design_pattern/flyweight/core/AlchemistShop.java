package com.wptdxii.playground.design_pattern.flyweight.core;

import java.util.ArrayList;
import java.util.List;

public class AlchemistShop {
    private List<Potion> topShelf;
    private List<Potion> bottomShelf;

    public AlchemistShop() {
        topShelf = new ArrayList<>();
        bottomShelf = new ArrayList<>();

        fillShelves();
    }

    private void fillShelves() {
        topShelf.add(PotionFactory.createPotion(PotionType.HEALING));
        topShelf.add(PotionFactory.createPotion(PotionType.HEALING));

        bottomShelf.add(PotionFactory.createPotion(PotionType.POISON));
        bottomShelf.add(PotionFactory.createPotion(PotionType.POISON));
    }

    public void enumerate(String potion) {
        System.out.println("Enumerating top shelf potions:");
        for (Potion p : topShelf) {
            p.drink(potion);
        }

        System.out.println("Enumerating bottom shelf potions:");

        for (Potion p : bottomShelf) {
            p.drink(potion);
        }
    }
}
