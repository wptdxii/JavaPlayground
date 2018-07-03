package com.wptdxii.playground.design_pattern.memento.core;

public interface Command {

    void execute(int num);

    void undo(Memento memento);

    void redo(Memento memento);

    Memento createMemento();
}
