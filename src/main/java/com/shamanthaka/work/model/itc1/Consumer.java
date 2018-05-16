package com.shamanthaka.work.model.itc1;

public class Consumer implements Runnable {
    private Item item;
    public Consumer(Item item){
        this.item = item;
    }

    public void run(){
        while (true){
            int prod = this.item.get();
        }
    }
}
