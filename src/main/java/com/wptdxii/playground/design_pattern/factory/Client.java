package com.wptdxii.playground.design_pattern.factory;

import com.wptdxii.playground.design_pattern.factory.core.Warcraft;
import com.wptdxii.playground.design_pattern.factory.core.WarcraftFactory;
import com.wptdxii.playground.design_pattern.factory.core.WarcraftType;

public class Client {

    public static void main(String[] args) {
        Warcraft warrior = WarcraftFactory.createWarcraft(WarcraftType.WARRIOR);
        warrior.fight();

        Warcraft thief = WarcraftFactory.createWarcraft(WarcraftType.THIEF);
        thief.fight();
    }
}
