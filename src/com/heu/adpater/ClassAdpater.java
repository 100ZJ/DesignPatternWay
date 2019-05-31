package com.heu.adpater;

/**
 * 类是配置 Adapter
 */
public class ClassAdpater extends Adaptee implements Target {


    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method1() {
        /**
         * 适配器可以重写 adaptee的方法, 不重写默认调用adaptee的方法
         */
        System.out.println("new  method1");
    }

}

class AdapterTest {
    /**
     * 模拟client
     * @param args
     */
    public static void main(String[] args) {
        ClassAdpater adpater = new ClassAdpater();
        adpater.method1();
        adpater.method2();
    }
}
