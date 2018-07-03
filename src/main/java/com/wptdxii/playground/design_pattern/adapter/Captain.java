package com.wptdxii.playground.design_pattern.adapter;

public class Captain {
    private RowingBoat rowingBoat;

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
