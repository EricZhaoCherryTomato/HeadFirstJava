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
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuack;
    
    
    
    public QuackCounter(Quackable duck){
        this.duck = duck;
        
    }
    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }
    
    public static int getQuacks(){
        return numberOfQuack;
    }
    
    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
    
}
