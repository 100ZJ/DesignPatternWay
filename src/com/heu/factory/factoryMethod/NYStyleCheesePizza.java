package com.heu.factory.factoryMethod;

public class NYStyleCheesePizza extends Pizza {
    /**
     * 无参构造器
     * 创建一个style pizza
     */
    public NYStyleCheesePizza() {
        name = "Ny Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";

        toppings.add("Crated Reggiano Cheese");
    }
}
