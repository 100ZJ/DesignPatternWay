package com.heu.adapter;

/**
 * ��������ģʽ ClassAdpater
 */
public class ClassAdpater extends Adaptee implements Target {


    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method1() {
        /**
         * ������������д adaptee�ķ���, ����дĬ�ϵ���adaptee�ķ���
         */
        System.out.println("new  method1");
    }

}

class AdapterTest {
    /**
     * ģ��client
     * @param args
     */
    public static void main(String[] args) {
        ClassAdpater adpater = new ClassAdpater();
        adpater.method1();
        adpater.method2();
    }
}
