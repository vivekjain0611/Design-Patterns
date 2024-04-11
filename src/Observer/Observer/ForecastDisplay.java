package Observer.Observer;

import Observer.Subject.Subject;
import Observer.Subject.WeatherData;

public class ForecastDisplay implements Observer,Display{

    float temperature;
    float pressure;
    float humidity;
    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherdata) {
        this.weatherData = weatherdata;
    }
    @Override
    public void display() {
        System.out.println("Forecast display ...");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
    }
}
