package com.heu.factory.abstractFactory;

public abstract class Pizza {

    String name;

    Dought dought;

    Clams clams;

    Cheese cheese;

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    /**
     * prepare()��������Ϊ���󷽷�������������У�������Ҫ�ռ���������Ҫ��ԭ�ϣ�����Щԭ�϶�������ԭ�Ϲ���
     */
    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
