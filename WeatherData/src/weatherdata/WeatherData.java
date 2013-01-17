package weatherdata;

import java.util.ArrayList;

public class WeatherData {

	private Integer temperature;
	private Integer pressure;
	private Integer humidity;
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		this.temperature = 0;
		this.pressure = 0;
		this.humidity = 0;
		this.observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer newObserver) {
		this.observers.add(newObserver);
	}
	
	public Integer getTemperature() {
		return this.temperature;
	}
	
	public Integer getPressure() {
		return this.pressure;
	}
	
	public Integer getHumidity() {
		return this.humidity;
	}
	
	public void measurementsChanged() {
		for (int i=0;i < this.observers.size(); i++) {
			Observer o = (Observer)this.observers.get(i);
			o.update(this.temperature, this.pressure, this.humidity);
		}
	}
	
	public static void main(String[] args) {
		WeatherData myWeatherData = new WeatherData();
		myWeatherData.measurementsChanged();
	}

}
