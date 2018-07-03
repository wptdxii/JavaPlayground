package com.wptdxii.playground.design_pattern.observer.generic;

import com.wptdxii.playground.design_pattern.observer.WeatherType;

public class Weather extends Observable<Weather, Race> {
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
        notifyObservers();
    }
}
