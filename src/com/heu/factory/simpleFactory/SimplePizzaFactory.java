package com.heu.factory.simpleFactory;

/**
 * 用于创建pizza的工厂类
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if("cheese".equals(type)) {
            pizza = new CheesePizza();
        }
        else if("veggie".equals(type)) {
            pizza = new VeggiePizze();
        } else {
            System.out.println("没有该种类pizza");
        }

        return pizza;
    }
}
