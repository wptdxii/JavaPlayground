package com.wptdxii.playground.design_pattern.command.undo_redo;

public interface Command {
    void execute(int num);

    void undo();

    void redo();
}
