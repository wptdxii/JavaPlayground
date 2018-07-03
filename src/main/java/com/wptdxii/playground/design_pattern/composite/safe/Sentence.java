package com.wptdxii.playground.design_pattern.composite.safe;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word word : words) {
            this.add(word);
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println(".");
    }
}
