package com.wptdxii.playground.design_pattern.command.macro;

public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void order(Command command) {
        if (command instanceof MainCommand) {
            ((MainCommand) command).setCook(new MainCook());
        } else if (command instanceof SideCommand) {
            ((SideCommand) command).setCook(new SideCook());
        }
        menuCommand.addCommand(command);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
