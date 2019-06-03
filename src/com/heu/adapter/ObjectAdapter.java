package com.heu.adapter;

/**
 * 对象适配器模式 ObjectAdapter
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    /**
     * 无参构造器，没法调用Adaptee中的method1 方法
     */
    public ObjectAdapter() {}

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
        ObjectAdapter objectAdapter1 = new ObjectAdapter(adaptee);
        objectAdapter1.method1();
        objectAdapter1.method2();
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.method1();
        objectAdapter.method2();
    }
}