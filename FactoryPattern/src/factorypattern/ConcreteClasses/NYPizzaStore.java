/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ConcreteClasses;

import factorypattern.AstractClasses.PizzaStore;
import factorypattern.AstractClasses.Pizza;
import factorypattern.AstractClasses.PizzaIngredientFactory;

/**
 *
 * @author zhaoye
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
      if(type.equals("cheese")){
          pizza = new NYStyleCheesePizza(ingredientFactory);
      }  else if(type.equals("veggie")){
          return new NYStyleVeggiePizza();
      } 
        return pizza;
    }
    
}
