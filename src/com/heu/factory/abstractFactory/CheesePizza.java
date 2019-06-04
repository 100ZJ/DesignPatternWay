package com.heu.factory.abstractFactory;

/**
 * Pizza�Ĵ���������صĹ�������ԭ�ϡ���������ԭ��������ʹ�õĹ�����
 * Pizza�������������Щԭ�ϣ���ֻ��Ҫ֪����������������ɡ����Pizza������ԭ��֮�䱻���
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    /**
     * ���ι��췽��
     * ͨ��pizzaIngredientFactory��ԭ�ϲ����� prepare()׼������
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
