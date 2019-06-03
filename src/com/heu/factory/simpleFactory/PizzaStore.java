package com.heu.factory.simpleFactory;

/**
 * pizzaStore�� ͨ��pizza������ ����pizza
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    /**
     * �µ� Ԥ��pizza
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(type);
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

}

class PizzaStoreTest {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("bbq");
    }



}
