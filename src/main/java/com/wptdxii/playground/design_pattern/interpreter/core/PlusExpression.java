package com.wptdxii.playground.design_pattern.interpreter.core;

public class PlusExpression extends OperatorExpression {

    public PlusExpression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
