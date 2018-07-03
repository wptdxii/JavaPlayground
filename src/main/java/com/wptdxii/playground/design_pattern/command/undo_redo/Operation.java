package com.wptdxii.playground.design_pattern.command.undo_redo;

public class Operation {
    private int result;

    public int getResult() {
        return result;
    }

    public void add(int num) {
        result += num;
    }

    public void subtract(int num) {
        result -= num;
    }
}
