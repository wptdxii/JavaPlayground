package com.wptdxii.playground.design_pattern.observer.core;

public class Hobbits implements WeatherObserver {
    @Override
    public void update(Weather weather) {
        System.out.println("The Hobbits watch the weather forecast : " + weather.getCurrentWeather());
    }
}
