package com.wptdxii.playground.design_pattern.facade.core;

import java.util.ArrayList;
import java.util.List;

public class DwarvenMineFacade {
    private final List<DwarvenMineWorker> workers;

    private DwarvenMineFacade() {
        if (SingletonHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("Already instantiated!");
        }

        workers = new ArrayList<>();
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenCartOperator());
        workers.add(new DwarvenTunnelDigger());
    }

    public static DwarvenMineFacade getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void makeActions(List<DwarvenMineWorker> workers, Action... actions) {
        for (DwarvenMineWorker worker : workers) {
            worker.action(actions);
        }
    }

    public void startNewDay() {
        makeActions(workers, Action.WAKE_UP, Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, Action.WORK);
    }

    public void endDay() {
        makeActions(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
    }

    private static class SingletonHolder {
        private static final DwarvenMineFacade INSTANCE = new DwarvenMineFacade();
    }

}
