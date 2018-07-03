package com.wptdxii.playground.design_pattern.composite.safe;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            add(letter);
        }
    }

    @Override
    public void print() {
        System.out.print(" ");
        super.print();
    }
}
