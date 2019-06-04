package com.heu.factory.abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dought createDought() {
        return null;
    }

    @Override
    public Clams createClams() {
        System.out.println("NYPizzaIngredientFactory New York Style createClams");
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("NYPizzaIngredientFactory New York Style createCheese");
        return new ReggianoCheese();
    }


}
