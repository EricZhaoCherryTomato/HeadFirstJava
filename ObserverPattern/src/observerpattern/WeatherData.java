/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author zhaoye
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @return the humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @return the pressure
     */
    public float getPressure() {
        return pressure;
    }
 }
