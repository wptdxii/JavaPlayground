package com.wptdxii.playground.design_pattern.command.simple;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
