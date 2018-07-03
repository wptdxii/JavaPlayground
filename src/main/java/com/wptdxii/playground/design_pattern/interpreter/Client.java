package com.wptdxii.playground.design_pattern.interpreter;

import com.wptdxii.playground.design_pattern.interpreter.core.Calculator;

public class Client {
    public static void main(String[] args) {
        String expression = "1 + 2 + 5 - 4 + 6";
        Calculator calculator = new Calculator(expression);
        System.out.println(calculator.calculate());
    }
}
