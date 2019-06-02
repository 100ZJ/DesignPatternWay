package com.heu.adapter;

/**
 * 对象适配器模式 ObjectAdapter
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}

class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.method1();
        objectAdapter.method2();
    }
}