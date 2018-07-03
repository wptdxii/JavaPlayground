package com.wptdxii.playground.design_pattern.composite.uniform;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite extends LetterComponent {
    private List<LetterComponent> children = new ArrayList<>();

    public LetterComposite(List<LetterComponent> children) {
        for (LetterComponent child : children) {
            add(child);
        }
    }

    @Override
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
