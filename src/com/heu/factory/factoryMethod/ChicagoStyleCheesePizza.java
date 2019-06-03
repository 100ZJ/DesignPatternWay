package com.heu.factory.factoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {
    /**
     * �޲ι�����
     * ����һ��style pizza
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
         * ��дpizza���cut()������ʵ�������Լ���ҵ���߼�
         */
        System.out.println("Cutting the Pizza into square slices");
    }
}
