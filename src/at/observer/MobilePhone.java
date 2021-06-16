package at.observer;

public class MobilePhone implements Observer{
    @Override
    public void info(int temperature) {
        System.out.println("I am a Mobilephone. The temperature is: " + temperature);
    }
}
