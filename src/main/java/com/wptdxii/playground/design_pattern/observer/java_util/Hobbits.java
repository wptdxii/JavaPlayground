package com.wptdxii.playground.design_pattern.observer.java_util;

import com.wptdxii.playground.design_pattern.observer.WeatherType;

import java.util.Observable;
import java.util.Observer;

public class Hobbits implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Weather) {
            WeatherType currentWeather = ((Weather) o).getCurrentWeather();
            System.out.println("The Hobbits watch the weather forecast : " + currentWeather);
        }
    }
}
