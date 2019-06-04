package com.heu.factory.abstractFactory;

/**
 * 首先创建一个原料工厂。该工厂为抽象工厂，负责创建所有的原料。
 */
public interface PizzaIngredientFactory {

    /**
     *  在接口中，每个原料都有一个对应的方法创建该原料
     * @return
     */
    public Dought createDought();

    public Clams createClams();

    public Cheese createCheese();


}
