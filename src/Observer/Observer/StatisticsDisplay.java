package Observer.Observer;

import Observer.Subject.Subject;
import Observer.Subject.WeatherData;

public class StatisticsDisplay implements Observer,Display{

    float temperature;
    float pressure;
    float humidity;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("StatisticsDisplay...");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
    }
}
