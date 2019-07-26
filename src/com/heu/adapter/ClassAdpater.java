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
//        ClassAdpater adpater = new ClassAdpater();
//        adpater.method1();
//        adpater.method2();
        int n = test(3);
        System.out.println(n);
        Inner inner = new Inner();
        System.out.println(test(inner).n);
    }

    private static Integer test(int n) {
        try{
            n ++;
            return n;
        }catch (Exception e){

        }finally {
            n--;
        }
        return null;
    }

    private static Inner test(Inner inner) {
        inner.n =3;
        try{
            inner.n++;
            return inner;
        }catch (Exception e){

        }finally {
            inner.n--;
        }
        return null;
    }

    public static class Inner{
        public int n =0;
    }
}
