package com.wptdxii.playground.design_pattern.abstract_factory;

import com.wptdxii.playground.design_pattern.abstract_factory.core.FactoryMaker;
import com.wptdxii.playground.design_pattern.abstract_factory.core.Kingdom;
import com.wptdxii.playground.design_pattern.abstract_factory.core.KingdomType;

public class Client {
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        kingdom.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
        getDescription(kingdom);

        kingdom.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
        getDescription(kingdom);
    }

    private static void getDescription(Kingdom kingdom) {
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }
}
