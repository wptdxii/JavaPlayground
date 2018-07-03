package com.wptdxii.playground.design_pattern.composite.uniform;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<LetterComponent> children) {
        super(children);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(".");
    }
}
