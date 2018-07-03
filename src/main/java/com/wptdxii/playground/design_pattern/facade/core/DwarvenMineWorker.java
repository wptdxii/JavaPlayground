package com.wptdxii.playground.design_pattern.facade.core;

public abstract class DwarvenMineWorker {

    public void goToSleep() {
        System.out.println(name() + " goes to sleep.");
    }

    public void wakeUp() {
        System.out.println(name() + " wake up.");
    }

    public void goHome() {
        System.out.println(name() + " goes home.");
    }

    public void goToMine() {
        System.out.println(name() + " goes to the mine.");
    }

    public abstract String name();

    public abstract void work();

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            case GO_HOME:
                goHome();
                break;
            default:
                System.out.println("Undefined work!");
                break;
        }
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }
}
