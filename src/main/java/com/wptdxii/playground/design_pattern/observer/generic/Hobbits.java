package com.wptdxii.playground.design_pattern.observer.generic;

public class Hobbits implements Race{
    @Override
    public void update(Weather subject) {
        System.out.println("The Hobbits watch the weather forecast : " + subject.getCurrentWeather());
    }
}
