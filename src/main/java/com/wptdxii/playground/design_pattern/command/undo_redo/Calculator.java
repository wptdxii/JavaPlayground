package com.wptdxii.playground.design_pattern.command.undo_redo;

import java.util.Deque;
import java.util.LinkedList;

public class Calculator {
    private Deque<Command> undoCommands = new LinkedList<>();
    private Deque<Command> redoCommands = new LinkedList<>();

    public void calculate(Command command, int num) {
        command.execute(num);
        undoCommands.offerLast(command);
    }

    public void undo() {
        if (!undoCommands.isEmpty()) {
            Command previousCmd = undoCommands.pollLast();
            redoCommands.offerLast(previousCmd);
            previousCmd.undo();
        }
    }

    public void redo() {
        if (!redoCommands.isEmpty()) {
            Command previousCmd = redoCommands.pollLast();
            undoCommands.offerLast(previousCmd);
            previousCmd.redo();
        }
    }
}
