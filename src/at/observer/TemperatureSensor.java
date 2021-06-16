package at.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private int temperature;
    private List<Observer> observers;

    public TemperatureSensor(int temperature) {
        this.temperature = temperature;
        this.observers = new ArrayList<>();
    }

    public void alarm(){
        informAll();
    }

    public void addOberserver(Observer observer) {
        this.observers.add(observer);
    }

    public void informAll() {
        for (Observer ob : this.observers) {
            ob.info(this.temperature);
        }
    }


}
