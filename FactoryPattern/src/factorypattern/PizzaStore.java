/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author zhaoye
 */
public abstract class PizzaStore {

    /**
     *
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = createPizza(type);
    
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    
    /**
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
    
    
}
