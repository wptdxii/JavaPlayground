package com.wptdxii.playground.design_pattern.observer.generic;

public interface Observer<S extends Observable<S, O>, O extends Observer<S, O>> {
    void update(S subject);
}
