package com.heu.factory.abstractFactory;
/**
 * Pizza�Ĵ���������صĹ�������ԭ�ϡ���������ԭ��������ʹ�õĹ�����
 * Pizza�������������Щԭ�ϣ���ֻ��Ҫ֪����������������ɡ����Pizza������ԭ��֮�䱻���
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
