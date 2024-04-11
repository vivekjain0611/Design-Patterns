package Observer.Subject;

import Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observerList;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }
    @Override
    public void register(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observerList) {
            o.update();
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
