package com.shamanthaka.threads.itc;

public class ProducerConsumerTest {
    public static void main(String[] args) {

        Item itemObject = new Item();//this shared object

        Producer producer = new Producer(itemObject);
        Thread producerThread = new Thread(producer);
        producerThread.start();//producer's run method will be called

        Consumer consumer = new Consumer(itemObject);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();//consumer's run method will be called

        try {
            producerThread.join();
            consumerThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
