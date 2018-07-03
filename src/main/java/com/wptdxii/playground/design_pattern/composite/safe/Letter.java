package com.wptdxii.playground.design_pattern.composite.safe;

public class Letter implements LetterComponent {
    private char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public void print() {
        System.out.print(letter);
    }
}
