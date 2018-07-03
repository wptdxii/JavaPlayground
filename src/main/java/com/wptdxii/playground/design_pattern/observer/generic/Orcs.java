package com.wptdxii.playground.design_pattern.observer.generic;

public class Orcs implements Race {
    @Override
    public void update(Weather subject) {
        System.out.println("The Orcs wathc the weather forecast : " + subject.getCurrentWeather());
    }
}
