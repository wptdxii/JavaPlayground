package com.wptdxii.playground.design_pattern.observer.java_util;

import com.wptdxii.playground.design_pattern.observer.WeatherType;

import java.util.Observable;

public class Weather extends Observable {
    private WeatherType currentWeather;

    public Weather() {
        currentWeather = WeatherType.SUNNY;
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        super.setChanged();
        super.notifyObservers();
    }
}
