package com.wptdxii.playground.design_pattern.interpreter.core;

public class MinusExpression extends OperatorExpression {

    public MinusExpression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
