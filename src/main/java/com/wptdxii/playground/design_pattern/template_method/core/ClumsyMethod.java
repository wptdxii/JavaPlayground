package com.wptdxii.playground.design_pattern.template_method.core;

public class ClumsyMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " from behind.");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
