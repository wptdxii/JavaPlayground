package com.wptdxii.playground.design_pattern.observer.generic;

public class Client {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.add(new Hobbits());
        weather.add(new Orcs());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
