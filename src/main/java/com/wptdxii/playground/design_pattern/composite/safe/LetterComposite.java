package com.wptdxii.playground.design_pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite implements LetterComponent {
    private List<LetterComponent> children = new ArrayList<>();

    public void add(LetterComponent child) {
        this.children.add(child);
    }

    @Override
    public void print() {
        for (LetterComponent child : children) {
            child.print();
        }
    }
}
