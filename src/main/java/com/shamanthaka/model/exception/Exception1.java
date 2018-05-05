package com.shamanthaka.model.exception;

public class Exception1 {

    public static void main(String[] args){

        try{
            Integer i = new Integer("12345");
            System.out.println("The value is " + i);
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }

        System.out.println("I am here....");
    }
}
