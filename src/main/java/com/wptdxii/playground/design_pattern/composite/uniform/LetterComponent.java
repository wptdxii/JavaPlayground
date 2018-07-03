package com.wptdxii.playground.design_pattern.composite.uniform;

public abstract class LetterComponent {

    public void add(LetterComponent child) {
        throw new UnsupportedOperationException("cant't add child nodes!");
    }

    public abstract void print();
}
