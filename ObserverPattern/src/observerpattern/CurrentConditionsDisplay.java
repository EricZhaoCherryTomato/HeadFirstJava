/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author zhaoye
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature 
                            +"F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
           WeatherData weatherdata = (WeatherData) o;
           this.temperature = weatherdata.getTemperature();
           this.humidity = weatherdata.getHumidity();
           display();
        }
    }
    
}
