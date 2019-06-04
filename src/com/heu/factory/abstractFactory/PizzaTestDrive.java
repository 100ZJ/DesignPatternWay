package com.heu.factory.abstractFactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.createPizza("cheese");
    }
}
