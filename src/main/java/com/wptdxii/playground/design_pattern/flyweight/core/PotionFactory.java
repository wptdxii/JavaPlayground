package com.wptdxii.playground.design_pattern.flyweight.core;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
    private static final Map<PotionType, Potion> potions = new EnumMap<>(PotionType.class);

    private PotionFactory() {
        throw new UnsupportedOperationException("Cant't be instantiated!");
    }

    static Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion(type);
                    potions.put(type, potion);
                    break;
                case POISON:
                    potion = new PoisonPotion(type);
                    potions.put(type, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}
