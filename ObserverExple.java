import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(int temperature);
}

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("WeatherStation: Temperature updated to " + temperature + "°C");
        notifyObservers();
    }
}

class PhoneDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("PhoneDisplay: Temperature is " + temperature + "°C");
    }
}

class TVDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("TVDisplay: Temperature is " + temperature + "°C");
    }
}

public class ObserverExple {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        weatherStation.removeObserver(tvDisplay);
        weatherStation.setTemperature(35);
    }
}