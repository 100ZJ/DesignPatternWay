package com.heu.factory.factoryMethod;

public class PizzaTestDrive {

    public static void main(String[] args) {
        System.out.println("Joel want chicago cheese pizza");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel order a" + joelPizza.getName());


        System.out.println("ZJ want NYStyle cheese pizza");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza zjPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("ZJ order a" + zjPizza.getName());
    }
}
