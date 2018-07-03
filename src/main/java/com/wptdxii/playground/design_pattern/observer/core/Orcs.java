package com.wptdxii.playground.design_pattern.observer.core;

public class Orcs implements WeatherObserver {
    @Override
    public void update(Weather weather) {
        System.out.println("The Orcs watch the weather forecast : " + weather.getCurrentWeather());
    }
}
