package com.shamanthaka.threads.itc;

public class Item {
    private int item;
    private boolean isProduced = false;

    public synchronized int get(){
        while(!isProduced){
            try {
                System.out.println("I am in get --wait ");
                wait();//unlocks the object
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.isProduced = false;
        notify();
        System.out.println("Got " + this.item);
        return this.item;
    }

    public synchronized void put(int item){
        while(this.isProduced){
            try {
                System.out.println("I am in put --wait ");
                wait();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.isProduced = true;
        notify();
        System.out.println("Put " + item);
        this.item = item;
    }
}
