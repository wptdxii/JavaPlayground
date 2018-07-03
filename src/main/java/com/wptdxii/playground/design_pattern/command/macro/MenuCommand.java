package com.wptdxii.playground.design_pattern.command.macro;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements Command {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
