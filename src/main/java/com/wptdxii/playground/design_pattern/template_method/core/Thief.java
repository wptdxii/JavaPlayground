package com.wptdxii.playground.design_pattern.template_method.core;

public class Thief {
    private StealingMethod method;

    public Thief(StealingMethod method) {
        this.method = method;
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        this.method.steal();
    }
}
