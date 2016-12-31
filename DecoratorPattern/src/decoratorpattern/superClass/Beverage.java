/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.superClass;

/**
 *
 * @author zhaoye
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
