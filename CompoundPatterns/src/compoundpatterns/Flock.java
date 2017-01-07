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
public class Flock implements Quackable {
    ArrayList ducks = new ArrayList();
    
    Observable observable;
    
    public Flock(){
        observable = new Observable(this);
    }
    
    public void add(Quackable quacker){
        ducks.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable)iterator.next();
            duck.quack();
        }
    }
    
    public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
    @Override
	public String toString() {
		return "Flock of Ducks";
	}
    
}
