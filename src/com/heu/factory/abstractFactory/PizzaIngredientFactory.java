package com.heu.factory.abstractFactory;

/**
 * ���ȴ���һ��ԭ�Ϲ������ù���Ϊ���󹤳������𴴽����е�ԭ�ϡ�
 */
public interface PizzaIngredientFactory {

    /**
     *  �ڽӿ��У�ÿ��ԭ�϶���һ����Ӧ�ķ���������ԭ��
     * @return
     */
    public Dought createDought();

    public Clams createClams();

    public Cheese createCheese();


}
