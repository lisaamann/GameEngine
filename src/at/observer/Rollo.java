package at.observer;

public class Rollo implements Observer{

    public void up(){
        System.out.println("Rollo is moving UP");
    }

    public void down(){
        System.out.println("Rollo is moving DOWN");
    }

    public String getType(){
        return "Type A";
    }

    @Override
    public void info(int temperature) {
        System.out.println("I am a Rollo. The temperature is " + temperature);
        down();
    }
}
