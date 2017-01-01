/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ConcreteClasses;

import factorypattern.AstractClasses.Pizza;
import factorypattern.AstractClasses.PizzaIngredientFactory;


/**
 *
 * @author zhaoye
 */
public class NYStyleCheesePizza extends Pizza  {

    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory ) {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
        this.ingredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing ");
        ingredientFactory.createDough();
    }
    
}
