package com.heu.factory.factoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {
    /**
     * 无参构造器
     * 创建一个style pizza
     */
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        /**
         * 重写pizza类的cut()方法，实现子类自己的业务逻辑
         */
        System.out.println("Cutting the Pizza into square slices");
    }
}
