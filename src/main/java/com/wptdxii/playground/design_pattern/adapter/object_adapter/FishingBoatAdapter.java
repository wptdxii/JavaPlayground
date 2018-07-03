package com.wptdxii.playground.design_pattern.adapter.object_adapter;

import com.wptdxii.playground.design_pattern.adapter.FishingBoat;
import com.wptdxii.playground.design_pattern.adapter.RowingBoat;

public class FishingBoatAdapter implements RowingBoat {
    private FishingBoat fishingBoat;

    public FishingBoatAdapter(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
