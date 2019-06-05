package com.heu.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData(天气主题)实现主题接口
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float tempterature;

    private float pressure;

    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(tempterature, humidity, pressure);
        }
    }

    /**
     * 气象站得到更新的观测数据时，通知观察者
     */
    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float tempterature, float humidity, float pressure) {
        this.tempterature = tempterature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}





























