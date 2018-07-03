package com.wptdxii.playground.design_pattern.observer;

public enum WeatherType {
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
