package com.wptdxii.playground.design_pattern.memento.core;

public class SubtractCommand extends AbstractCommand {

    public SubtractCommand(Operation operation) {
        super(operation);
    }

    @Override
    public void execute(int num) {
        this.operation.subtract(num);
    }
}
