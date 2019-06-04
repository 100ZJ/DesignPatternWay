package com.heu.factory.factoryMethod;


import java.util.ArrayList;
import java.util.List;

/**
 * 抽象pizza类
 */
public abstract class Pizza {

    public String name;//名称
    public String dough;//面团
    public String sause;//酱料
    public List<String> toppings = new ArrayList<String>(); //佐料

    public void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");

        for(int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
