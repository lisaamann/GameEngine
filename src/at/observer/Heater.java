package at.observer;

public class Heater implements Observer{
    @Override
    public void info(int temperature) {
        System.out.println("I am heater. The temperature is: " + temperature);
    }
}
