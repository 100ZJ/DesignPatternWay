package com.heu.factory.factoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else {
            System.out.println("NYStyle û������style��pizza");
        }

        return pizza;
    }
}
