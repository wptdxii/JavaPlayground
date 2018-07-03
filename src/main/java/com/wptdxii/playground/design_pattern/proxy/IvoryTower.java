package com.wptdxii.playground.design_pattern.proxy;

public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }
}
