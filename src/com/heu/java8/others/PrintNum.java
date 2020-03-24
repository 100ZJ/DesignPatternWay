package com.heu.java8.others;

public class PrintNum {
    private static int count = 1;
    private static int c = 0;
    private static Object object = new Object();

    static class MyPrintThread extends Thread{
        int index;
        public MyPrintThread(int index){
            this.index = index;
        }
        @Override
        public void run(){
            try {
                while (count < 101){
                    synchronized (object){
                        if(c % 3 == index){
                            for(int i = 0; i < 3; i++){
                                if(count <= 100){
                                    System.out.println(Thread.currentThread().getName() + "��ӡ��:" + count);
                                    count++;
                                }
                            }
                            c++;
                            object.notifyAll();
                        }else{
                            object.wait();
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyPrintThread(0);
        Thread t2 = new MyPrintThread(1);
        Thread t3 = new MyPrintThread(2);
        t1.setName("�߳�1");
        t2.setName("�߳�2");
        t3.setName("�߳�3");

        t1.start();
        t2.start();
        t3.start();
    }
}
