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
public class NYStyleCheesePizza extends Pizza {


    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
    }
    
}
