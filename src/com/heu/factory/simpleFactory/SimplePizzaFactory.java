package com.heu.factory.simpleFactory;

/**
 * ���ڴ���pizza�Ĺ�����
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if(type.contains(".")) {
            try {
                pizza = (Pizza) Class.forName(type).newInstance();
            } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
                e.printStackTrace();
            }

        } else {
            if("cheese".equals(type)) {
                pizza = new CheesePizza();
            }
            else if("veggie".equals(type)) {
                pizza = new VeggiePizze();
            } else {
                System.out.println("û�и�����pizza");
            }
        }

        return pizza;
    }
}
