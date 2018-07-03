package com.wptdxii.playground.design_pattern.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable<S extends Observable<S, O>, O extends Observer<S, O>> {
    protected List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void add(O observer) {
        this.observers.add(observer);
    }

    public boolean remove(O observer) {
        return this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (O observer : observers) {
            observer.update((S) this);
        }
    }
}
