package com.wptdxii.playground.design_pattern.memento.core;


import java.util.Deque;
import java.util.LinkedList;

public class Calculator {
    private Deque<Memento> undoMementos = new LinkedList<>();
    private Deque<Memento> redoMementos = new LinkedList<>();
    private Deque<Command> undoCommands = new LinkedList<>();
    private Deque<Command> redoCommands = new LinkedList<>();

    public void calculate(Command command, int num) {
        undoMementos.offerLast(command.createMemento());
        undoCommands.offerLast(command);
        command.execute(num);
    }

    public void undo() {
        if (!undoMementos.isEmpty()) {
            Command previousCmd = undoCommands.pollLast();
            redoCommands.offerLast(previousCmd);

            Memento previousMemento = undoMementos.pollLast();
            redoMementos.offerLast(previousCmd.createMemento());
            previousCmd.undo(previousMemento);
        }
    }

    public void redo() {
        if (!redoMementos.isEmpty()) {
            Command previousCmd = redoCommands.pollLast();
            undoCommands.offerLast(previousCmd);

            Memento previousMemento = redoMementos.pollLast();
            undoMementos.offerLast(previousCmd.createMemento());
            previousCmd.redo(previousMemento);
        }
    }
}
