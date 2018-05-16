package com.shamanthaka.threads.itc;

public class Consumer implements Runnable{

    private Item item;

    public Consumer(Item item){
        this.item = item;
    }

    public void run(){
        while(true){
            int prod = this.item.get();
            /*try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            //System.out.println("Consumed Item is " + prod);
        }
    }
}
