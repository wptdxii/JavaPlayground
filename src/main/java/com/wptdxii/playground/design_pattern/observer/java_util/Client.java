package com.wptdxii.playground.design_pattern.observer.java_util;

public class Client {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Hobbits());
        weather.addObserver(new Orcs());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
