package com.wptdxii.playground.design_pattern.flyweight;

import com.wptdxii.playground.design_pattern.flyweight.core.AlchemistShop;

public class Client {
    public static void main(String[] args) {
        AlchemistShop shop = new AlchemistShop();
        shop.enumerate("HolyWater");
        shop.enumerate("MagicWater");
    }
}
