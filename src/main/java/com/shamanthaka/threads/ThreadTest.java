package com.shamanthaka.threads;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

    }
}

class MyThread extends Thread{

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

}

