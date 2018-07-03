package com.wptdxii.playground.design_pattern.template_method.core;

public abstract class StealingMethod {
    // factory method
    protected abstract String pickTarget();

    // primitive method
    protected abstract void confuseTarget(String target);

    // primitive method
    protected abstract void stealTheItem(String target);

    // hook method
    protected void wander() {
        System.out.println("The thief wanders around the street.");
    }

    // template method
    public final void steal() {
        wander();
        String target = pickTarget();
        confuseTarget(target);
        stealTheItem(target);
    }
}
