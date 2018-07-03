package com.wptdxii.playground.design_pattern.command.macro;

public class MainCommand implements Command {
    private Cook cook;

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cook("");
    }
}
