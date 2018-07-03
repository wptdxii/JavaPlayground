package com.wptdxii.playground.design_pattern.memento.core;

public abstract class AbstractCommand implements Command {
    protected Operation operation;

    public AbstractCommand(Operation operation) {
        this.operation = operation;
    }

    @Override
    public abstract void execute(int num);

    @Override
    public void undo(Memento memento) {
        operation.setMemento(memento);
    }

    @Override
    public void redo(Memento memento) {
        operation.setMemento(memento);
    }

    @Override
    public Memento createMemento() {
        return operation.createMemento();
    }
}
