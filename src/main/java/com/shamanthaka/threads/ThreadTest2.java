package com.shamanthaka.threads;

public class ThreadTest2 {

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();

        Thread t1 = new Thread(myThread);
        t1.start();

        MyThread2 myThread2 = new MyThread2();

        Thread t2 = new Thread(myThread2);
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Main Thread completed.   " + Thread.currentThread().getName());
    }
}


class MyThread2 implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

}
