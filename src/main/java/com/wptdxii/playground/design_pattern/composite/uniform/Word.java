package com.wptdxii.playground.design_pattern.composite.uniform;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<LetterComponent> children) {
        super(children);
    }

    @Override
    public void print() {
        System.out.print(" ");
        super.print();
    }
}
