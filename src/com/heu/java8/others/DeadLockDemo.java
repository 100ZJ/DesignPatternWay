package com.heu.java8.others;

public class DeadLockDemo {

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1) {
                    //��ȡo1����
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //���Ի�ȡ02����
                    synchronized (o2) {
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o2) {
                    //��ȡo2����
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //���Ի�ȡ01����
                    synchronized (o1) {
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
