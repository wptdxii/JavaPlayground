package com.wptdxii.playground.design_pattern.interpreter.core;

import java.util.Stack;

public class Calculator {
    private Stack<ArithmeticExpression> expressionStack = new Stack<>();

    public Calculator(String expression) {
        parseExpression(expression);
    }

    private void parseExpression(String expression) {
        String[] tokenList = expression.split(" ");
        for (int i = 0; i < tokenList.length; i++) {
            String s = tokenList[i];
            if (isOperator(s)) {
                ArithmeticExpression leftExpression = expressionStack.pop();
                ArithmeticExpression rightExpression = new NumberExpression(tokenList[++i]);
                ArithmeticExpression operatorExpression = getOperatorExpression(s, leftExpression, rightExpression);
                expressionStack.push(new NumberExpression(operatorExpression.interpret()));

            } else {
                expressionStack.push(new NumberExpression(s));
            }

        }
    }

    private ArithmeticExpression getOperatorExpression(String operator, ArithmeticExpression leftExpression,
                                                       ArithmeticExpression rightExpression) {

        switch (operator) {
            case "+":
                return new PlusExpression(leftExpression, rightExpression);
            case "-":
                return new MinusExpression(leftExpression, rightExpression);
            default:
                return null;
        }
    }

    private boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s);
    }

    public int calculate() {
        return expressionStack.pop().interpret();
    }
}
