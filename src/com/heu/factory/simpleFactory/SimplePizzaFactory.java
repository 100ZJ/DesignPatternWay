package com.heu.factory.simpleFactory;

/**
 * ���ڴ���pizza�Ĺ�����
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
            System.out.println("û�и�����pizza");
        }

        return pizza;
    }
}
