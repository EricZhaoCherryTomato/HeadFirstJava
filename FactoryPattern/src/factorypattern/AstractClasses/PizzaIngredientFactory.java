/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.AstractClasses;

import factorypattern.ConcreteClasses.Veggies;
import factorypattern.ConcreteClasses.Sauce;
import factorypattern.ConcreteClasses.Pepperoni;
import factorypattern.ConcreteClasses.Cheese;
import factorypattern.ConcreteClasses.Clams;
import factorypattern.ConcreteClasses.Dough;

/**
 *
 * @author zhaoye
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
