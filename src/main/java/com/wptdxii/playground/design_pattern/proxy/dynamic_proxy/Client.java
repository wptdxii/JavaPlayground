package com.wptdxii.playground.design_pattern.proxy.dynamic_proxy;

import com.wptdxii.playground.design_pattern.proxy.IvoryTower;
import com.wptdxii.playground.design_pattern.proxy.Wizard;
import com.wptdxii.playground.design_pattern.proxy.WizardTower;

public class Client {
    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy();
        WizardTower wizardTower = proxy.getProxy(new IvoryTower());
        wizardTower.enter(new Wizard("Red wizard"));
        wizardTower.enter(new Wizard("White wizard"));
        wizardTower.enter(new Wizard("Black wizard"));
        wizardTower.enter(new Wizard("Green wizard"));
        wizardTower.enter(new Wizard("Brown wizard"));
    }
}
