package com.wptdxii.playground.design_pattern.observer.core;

import com.wptdxii.playground.design_pattern.observer.WeatherType;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        currentWeather = WeatherType.SUNNY;
        observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public boolean removeObserver(WeatherObserver observer) {
        return observers.remove(observer);
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(this);
        }
    }
}
