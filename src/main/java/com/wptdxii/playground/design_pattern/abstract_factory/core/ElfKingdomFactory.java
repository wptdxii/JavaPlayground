package com.wptdxii.playground.design_pattern.abstract_factory.core;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
