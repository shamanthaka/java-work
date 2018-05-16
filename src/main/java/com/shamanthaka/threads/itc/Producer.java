package com.shamanthaka.threads.itc;

public class Producer implements Runnable {

    private Item item;

    public Producer(Item myItem){
        this.item = myItem;
    }

    @Override
    public void run(){
        int num = 0;
        while(true) {
            item.put(++num);
            /*try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            //System.out.println("Produced item is " + num);
        }
    }
}
