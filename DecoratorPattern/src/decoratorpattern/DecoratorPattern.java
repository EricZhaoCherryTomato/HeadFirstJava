/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

import decoratorpattern.beverages.Expresso;
import decoratorpattern.beverages.HouseBlend;
import decoratorpattern.condiments.Mocha;
import decoratorpattern.superClass.Beverage;

/**
 *
 * @author zhaoye
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()
                            + " $" + beverage.cost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()
                            + " $" + beverage2.cost());
    }
    
}
