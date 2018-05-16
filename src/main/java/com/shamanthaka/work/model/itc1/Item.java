package com.shamanthaka.work.model.itc1;

public  class Item {
    private int item;
    private boolean isProduced = false;

    public synchronized int get(){
        if(!isProduced){
            try {
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
        if(this.isProduced){
            try {
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
