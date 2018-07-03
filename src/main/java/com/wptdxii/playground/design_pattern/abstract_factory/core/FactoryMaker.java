package com.wptdxii.playground.design_pattern.abstract_factory.core;

public final class FactoryMaker {

    private FactoryMaker() {
        throw new UnsupportedOperationException("Can't be instantiated");
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}
