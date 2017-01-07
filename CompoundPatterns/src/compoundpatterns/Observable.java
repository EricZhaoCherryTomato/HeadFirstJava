/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundpatterns;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author zhaoye
 */
public class Observable implements QuackObservable{
    ArrayList observers = new ArrayList();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
        @Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
    @Override
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
