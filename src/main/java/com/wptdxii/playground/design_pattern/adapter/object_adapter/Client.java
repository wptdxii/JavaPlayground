package com.wptdxii.playground.design_pattern.adapter.object_adapter;

import com.wptdxii.playground.design_pattern.adapter.Captain;
import com.wptdxii.playground.design_pattern.adapter.FishingBoat;

public class Client {
    public static void main(String[] args) {
        Captain captain = new Captain();
        FishingBoatAdapter adapter = new FishingBoatAdapter(new FishingBoat());
        captain.setRowingBoat(adapter);
        captain.row();
    }
}
