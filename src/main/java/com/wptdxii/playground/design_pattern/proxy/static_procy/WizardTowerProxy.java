package com.wptdxii.playground.design_pattern.proxy.static_procy;

import com.wptdxii.playground.design_pattern.proxy.Wizard;
import com.wptdxii.playground.design_pattern.proxy.WizardTower;

public class WizardTowerProxy implements WizardTower {
    private static final int NUM_WIZARDS_ALLOWED = 3;
    private final WizardTower wizardTower;
    private int numWizards;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            wizardTower.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
