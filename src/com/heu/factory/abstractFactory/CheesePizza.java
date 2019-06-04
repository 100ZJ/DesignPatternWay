package com.heu.factory.abstractFactory;

/**
 * Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，
 * Pizza类根本不关心这些原料，它只需要知道如何制作披萨即可。这里，Pizza和区域原料之间被解耦。
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    /**
     * 带参构造方法
     * 通过pizzaIngredientFactory的原料参数， prepare()准备材料
     * @param pizzaIngredientFactory
     */
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        prepare();
    }

    @Override
    void prepare() {
        System.out.println("Prepareing" + name);
        dought = pizzaIngredientFactory.createDought();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }

}
