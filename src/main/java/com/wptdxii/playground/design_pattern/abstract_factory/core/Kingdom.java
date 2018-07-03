package com.wptdxii.playground.design_pattern.abstract_factory.core;

public final class Kingdom {
    private Army army;
    private Castle castle;
    private King king;

    public void createKingdom(KingdomFactory kingdomFactory) {
        setArmy(kingdomFactory.createArmy());
        setCastle(kingdomFactory.createCastle());
        setKing(kingdomFactory.createKing());
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }
}
