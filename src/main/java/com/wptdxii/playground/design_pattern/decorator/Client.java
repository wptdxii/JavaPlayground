package com.wptdxii.playground.design_pattern.decorator;

import com.wptdxii.playground.design_pattern.decorator.core.ClubbedTroll;
import com.wptdxii.playground.design_pattern.decorator.core.FlyingTroll;
import com.wptdxii.playground.design_pattern.decorator.core.SimpleTroll;
import com.wptdxii.playground.design_pattern.decorator.core.Troll;

public class Client {
    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("The troll power：" + troll.getAttackPower());

        troll = new ClubbedTroll(troll);
        troll.attack();
        troll.fleeBattle();
        System.out.println("The Troll power：" + troll.getAttackPower());

        troll = new FlyingTroll(troll);
        troll.attack();
        troll.fleeBattle();
        System.out.println("The Troll power：" + troll.getAttackPower());
    }
}
