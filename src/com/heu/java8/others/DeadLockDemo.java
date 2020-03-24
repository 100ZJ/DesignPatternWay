package com.heu.java8.others;

public class DeadLockDemo {

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1) {
                    //获取o1的锁
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //尝试获取02的锁
                    synchronized (o2) {
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o2) {
                    //获取o2的锁
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //尝试获取01的锁
                    synchronized (o1) {
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
