package com.shamanthaka.work.model.itc1;

public class Producer implements Runnable {
    private Item item;

    public Producer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        int num = 0;
        while (true) {
            this.item.put(++num);

        }
    }
}