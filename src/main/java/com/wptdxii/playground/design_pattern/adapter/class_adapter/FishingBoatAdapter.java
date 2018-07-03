package com.wptdxii.playground.design_pattern.adapter.class_adapter;

import com.wptdxii.playground.design_pattern.adapter.FishingBoat;
import com.wptdxii.playground.design_pattern.adapter.RowingBoat;

public class FishingBoatAdapter extends FishingBoat implements RowingBoat {

    @Override
    public void row() {
        sail();
    }
}
