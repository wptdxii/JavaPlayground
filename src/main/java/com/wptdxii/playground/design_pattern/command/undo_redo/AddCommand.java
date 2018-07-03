package com.wptdxii.playground.design_pattern.command.undo_redo;

public class AddCommand implements Command {
    private Operation operation;
    private int num;

    public AddCommand(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void execute(int num) {
        this.num = num;
        operation.add(num);
    }

    @Override
    public void undo() {
        operation.subtract(num);
    }

    @Override
    public void redo() {
        operation.add(num);
    }
}
