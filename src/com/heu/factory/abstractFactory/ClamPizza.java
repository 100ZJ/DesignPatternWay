package com.heu.factory.abstractFactory;
/**
 * Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，
 * Pizza类根本不关心这些原料，它只需要知道如何制作披萨即可。这里，Pizza和区域原料之间被解耦。
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        prepare();
    }

    @Override
    void prepare() {
        System.out.println("prepareing" + name);
        dought = pizzaIngredientFactory.createDought();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
