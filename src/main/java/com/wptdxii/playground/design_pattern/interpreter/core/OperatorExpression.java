package com.wptdxii.playground.design_pattern.interpreter.core;

public abstract class OperatorExpression implements ArithmeticExpression {
    protected ArithmeticExpression leftExpression;
    protected ArithmeticExpression rightExpression;

    public OperatorExpression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public abstract int interpret();
}
