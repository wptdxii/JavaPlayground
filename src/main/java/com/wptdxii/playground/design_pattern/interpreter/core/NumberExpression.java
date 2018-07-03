package com.wptdxii.playground.design_pattern.interpreter.core;

public class NumberExpression implements ArithmeticExpression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return number;
    }
}
