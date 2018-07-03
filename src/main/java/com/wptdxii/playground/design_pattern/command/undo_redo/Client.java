package com.wptdxii.playground.design_pattern.command.undo_redo;

public class Client {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.getResult());

        Calculator calculator = new Calculator();
        calculator.calculate(new AddCommand(operation), 5);
        System.out.println(operation.getResult());

        calculator.calculate(new SubtractCommand(operation), 3);
        System.out.println(operation.getResult());

        calculator.undo();
        System.out.println(operation.getResult());

        calculator.redo();
        System.out.println(operation.getResult());
    }
}
