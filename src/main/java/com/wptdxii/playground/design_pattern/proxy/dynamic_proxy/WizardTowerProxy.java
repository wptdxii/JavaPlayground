package com.wptdxii.playground.design_pattern.proxy.dynamic_proxy;

import com.wptdxii.playground.design_pattern.proxy.WizardTower;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WizardTowerProxy implements InvocationHandler {
    private static final int NUM_WIZARDS_ALLOWED = 3;
    private WizardTower wizardTower;
    private int numWizards;

    public WizardTower getProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
        return (WizardTower) Proxy.newProxyInstance(wizardTower.getClass().getClassLoader(),
                wizardTower.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            numWizards++;
            return method.invoke(wizardTower, args[0]);
        } else {
            System.out.println(args[0] + "is not allowed to enter!");
            return null;
        }
    }
}
