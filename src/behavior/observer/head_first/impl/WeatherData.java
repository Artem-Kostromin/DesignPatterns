package behavior.observer.head_first.impl;

import behavior.observer.head_first.Observer;
import behavior.observer.head_first.Subject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private Set<Observer> observers = new HashSet<>();

    public void dataUpdated(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(x -> x.update(temperature, humidity, pressure));
    }
}
