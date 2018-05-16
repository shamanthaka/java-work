package com.shamanthaka.threads.itc.bank;

public class AmountTransfer implements Runnable {

    private Bank bank;
    private double maxAmount;
    private int fromAccount;

    public AmountTransfer(Bank b,double maxAmount,int from){
        this.bank = b;
        this.maxAmount = maxAmount;
        this.fromAccount = from;
    }

    public void run(){
        while(true) {
            int toAccount = (int)(this.bank.bankSize() * Math.random());
            double maxAmount = (double)(this.maxAmount * Math.random());
            this.bank.transfer(fromAccount,toAccount,maxAmount);
        }
    }
}
