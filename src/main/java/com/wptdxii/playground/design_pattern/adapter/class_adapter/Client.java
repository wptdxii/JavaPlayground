package com.wptdxii.playground.design_pattern.adapter.class_adapter;

import com.wptdxii.playground.design_pattern.adapter.Captain;

public class Client {
    public static void main(String[] args) {
        Captain captain = new Captain();
        captain.setRowingBoat(new FishingBoatAdapter());
        captain.row();
    }
}
