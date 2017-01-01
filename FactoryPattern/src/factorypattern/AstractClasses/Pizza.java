/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.AstractClasses;

import java.util.ArrayList;

/**
 *
 * @author zhaoye
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();
    
    public abstract void prepare();

    void bake() {
        System.out.println("Baking for 25 mins");
    }

    void cut() {
        System.out.println("Cutting" );
    }

    void box() {
        System.out.println("Place pizza in box.");
    }
    
    public String getName(){
        return name;
    }

    
    
}
