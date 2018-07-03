package com.wptdxii.playground.design_pattern.command.undo_redo;

public class SubtractCommand implements Command {
    private Operation operation;
    private int num;

    public SubtractCommand(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void execute(int num) {
        this.num = num;
        operation.subtract(num);
    }

    @Override
    public void undo() {
        this.operation.add(num);
    }

    @Override
    public void redo() {
        this.operation.subtract(num);
    }
}
