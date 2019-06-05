package com.heu.observer;

/**
 * ≤‚ ‘≥Ã–Ú
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondituonDisplay condituonDisplay = new CurrentCondituonDisplay(weatherData);

        weatherData.setMeasurements(80,80,80f);
        weatherData.setMeasurements(70,70,70f);
        weatherData.setMeasurements(100,100,100f);

    }
}
