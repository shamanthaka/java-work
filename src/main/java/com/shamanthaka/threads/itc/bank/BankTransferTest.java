package com.shamanthaka.threads.itc.bank;

public class BankTransferTest {

    private static int NO_OF_CUSTOMERS = 100;
    private static double INITIAL_AMOUNT= 1000;

    public static void main(String[] args){
        Bank bank = new Bank(NO_OF_CUSTOMERS,INITIAL_AMOUNT);  //shared object

        for(int i = 0; i < NO_OF_CUSTOMERS; i++) {
            AmountTransfer amountTransfer = new AmountTransfer(bank,INITIAL_AMOUNT,i);
            Thread amountTransferThread = new Thread(amountTransfer);
            amountTransferThread.start();
        }
    }
}
