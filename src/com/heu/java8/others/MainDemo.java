package com.heu.java8.others;

class Prints {
    public int num = 0;
    synchronized public void methodA() throws InterruptedException{
        while(num!=0){
            wait();
        }
        System.out.println(Thread.currentThread().getName()+":"+num);
        num = 1;
        notifyAll();
    }
    synchronized public void methodB() throws InterruptedException{
        while(num!=1){
            wait();
        }
        System.out.println(Thread.currentThread().getName()+":"+num);
        num = 2;
        notifyAll();
    }
    synchronized public void methodC() throws InterruptedException{
        while(num!=2){
            wait();
        }
        System.out.println(Thread.currentThread().getName()+":"+num);
        notifyAll();
    }
}
class ThreadClassA implements Runnable{
    private Prints p;
    public ThreadClassA(Prints p) {
        this.p = p;
    }
    @Override
    public void run() {
        try {
            p.methodA();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
class ThreadClassB implements Runnable{
    private Prints p;
    public ThreadClassB(Prints p) {
        this.p = p;
    }
    @Override
    public void run() {
        try {
            p.methodB();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
class ThreadClassC implements Runnable{
    private Prints p;
    public ThreadClassC(Prints p) {
        this.p = p;
    }
    @Override
    public void run() {
        try {
            p.methodC();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
public class MainDemo{
    public static void main(String[] args) throws CloneNotSupportedException {
        Prints p = new Prints();
        ThreadClassA a = new ThreadClassA(p);
        ThreadClassB b = new ThreadClassB(p);
        ThreadClassC c = new ThreadClassC(p);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}
