package com.wptdxii.playground.design_pattern.proxy.static_procy;

import com.wptdxii.playground.design_pattern.proxy.IvoryTower;
import com.wptdxii.playground.design_pattern.proxy.Wizard;

public class Client {
    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
    }
}