package com.wptdxii.playground.design_pattern.factory_method;

import com.wptdxii.playground.design_pattern.factory_method.core.Warcraft;
import com.wptdxii.playground.design_pattern.factory_method.core.WarcraftFactory;
import com.wptdxii.playground.design_pattern.factory_method.core.WarcraftType;

public class Client {
    public static void main(String[] args) {
        Warcraft warrior = WarcraftFactory.createWarcraft(WarcraftType.WARRIOR);
        warrior.fight();

        Warcraft thief = WarcraftFactory.createWarcraft(WarcraftType.THIEF);
        thief.fight();
    }
}
