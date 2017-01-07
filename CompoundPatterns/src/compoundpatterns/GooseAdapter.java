/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundpatterns;

/**
 *
 * @author zhaoye
 */
public class GooseAdapter implements Quackable
{
    Goose goose;
    
    Observable observable;
   
    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        goose.honk();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
    
}
