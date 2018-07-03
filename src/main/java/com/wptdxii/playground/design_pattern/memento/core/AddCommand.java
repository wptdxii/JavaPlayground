package com.wptdxii.playground.design_pattern.memento.core;

public class AddCommand extends AbstractCommand{

    public AddCommand(Operation operation) {
        super(operation);
    }

    @Override
    public void execute(int num) {
        this.operation.add(num);
    }
}
