package com.heu.factory.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            System.out.println("Chicago 没有该种类pizza");
        }
        return pizza;
    }
}
