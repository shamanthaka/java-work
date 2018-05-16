package com.shamanthaka.work.model.itc1;



public class ProducerConsumerTest {
    public static void main(String[] args ){
        Item item = new Item();
        Producer producer = new Producer(item);
                Thread thread = new Thread(producer);
                thread.start();

       /* Thread consumerThread = new Thread(consumer);
        consumerThread.start();*/

    }
}
