package Observer.Observer;

import Observer.Subject.Subject;
import Observer.Subject.WeatherData;

public class CurrentConditionDisplay implements Observer,Display{

    float temperature;
    float pressure;
    float humidity;
    WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("Current Condition Display");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
    }
}
