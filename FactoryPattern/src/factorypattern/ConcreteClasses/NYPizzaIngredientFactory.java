/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ConcreteClasses;

import factorypattern.AstractClasses.PizzaIngredientFactory;
import factorypattern.ConcreteClasses.Cheese;
import factorypattern.ConcreteClasses.Clams;
import factorypattern.ConcreteClasses.Dough;
import factorypattern.ConcreteClasses.Pepperoni;
import factorypattern.ConcreteClasses.Sauce;
import factorypattern.ConcreteClasses.Veggies;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cheese createCheese() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veggies[] createVeggies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pepperoni createPepperoni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clams createClam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
