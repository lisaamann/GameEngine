package at.observer;

public class ObserverTest {
    public static void main(String[] args) {
        MobilePhone mobilePhone1 = new MobilePhone();
        MobilePhone mobilePhone2 = new MobilePhone();
        Heater heater1 = new Heater();
        Rollo rollo1 = new Rollo();

        TemperatureSensor temperatureSensor = new TemperatureSensor(19);

        temperatureSensor.addOberserver(mobilePhone1);
        temperatureSensor.addOberserver(mobilePhone2);
        temperatureSensor.addOberserver(rollo1);

        temperatureSensor.alarm();
    }
}
