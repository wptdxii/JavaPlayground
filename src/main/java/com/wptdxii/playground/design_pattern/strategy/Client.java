package com.wptdxii.playground.design_pattern.strategy;

import com.wptdxii.playground.design_pattern.strategy.core.DragonSlayer;
import com.wptdxii.playground.design_pattern.strategy.core.MeleeStrategy;
import com.wptdxii.playground.design_pattern.strategy.core.ProjectileStrategy;
import com.wptdxii.playground.design_pattern.strategy.core.SpellStrategy;

public class Client {

    public static void main(String[] args) {
        DragonSlayer slayer = new DragonSlayer(new MeleeStrategy());
        slayer.goToBattle();

        slayer.changeStrategy(new ProjectileStrategy());
        slayer.goToBattle();

        slayer.changeStrategy(new SpellStrategy());
        slayer.goToBattle();

        // Java 8 Strategy pattern
        slayer = new DragonSlayer(() -> System.out.println("Sever the dragon's head in he melee!"));
        slayer.goToBattle();

        slayer.changeStrategy(() -> System.out.println("Shoot the dragon with the magical crossbow!"));
        slayer.goToBattle();

        slayer.changeStrategy(() -> System.out.println("Cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        slayer.goToBattle();
    }
}
