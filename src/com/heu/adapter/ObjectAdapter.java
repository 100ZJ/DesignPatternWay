package com.heu.adapter;

/**
 * ����������ģʽ ObjectAdapter
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    /**
     * �޲ι�������û������Adaptee�е�method1 ����
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