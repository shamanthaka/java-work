package com.shamanthaka.threads.itc.bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;

    public Bank(int numberOfCustomers, double initialAmount){

        accounts = new double[numberOfCustomers];

        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();

        for(int i = 0; i < numberOfCustomers; i++){
            accounts[i] = initialAmount;
        }
    }

    public void transfer(int from, int to, double amount){
        bankLock.lock();
        try {
            while(accounts[from] < amount){
                try {
                    sufficientFunds.await();//waited and unlock
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread());
            accounts[from] = accounts[from] - amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] = accounts[to] + amount;
            System.out.printf("Total Balance: %10.2f/n", this.getTotalBalance());
            sufficientFunds.signalAll();
        }finally {
            bankLock.unlock();
        }

    }

    public double getTotalBalance(){
        bankLock.lock();
        double sum = 0d;
        for(double amount : accounts){
            sum = sum + amount;
        }
        bankLock.unlock();
        return sum;
    }

    public int bankSize(){
        return accounts.length;
    }
}
