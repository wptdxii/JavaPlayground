package com.wptdxii.playground.design_pattern.object_pool.core;

public class Reusable {
    private static int counter = 1;
    private int id;

    public Reusable() {
        id = counter++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Reusable id=%d", id);
    }
}
