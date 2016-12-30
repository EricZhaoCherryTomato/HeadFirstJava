/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.condiments;

import decoratorpattern.decorator.CondimentDecorator;
import decoratorpattern.superClass.Beverage;

/**
 *
 * @author zhaoye
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
    
}
