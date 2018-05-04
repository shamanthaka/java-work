package com.shamanthaka.model.exception;

public class Exception1 {

    public static void main(String[] args){

        try {
            Integer i = new Integer("123");

            System.out.println(i);
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }

        System.out.println("I am here....");
    }
}
