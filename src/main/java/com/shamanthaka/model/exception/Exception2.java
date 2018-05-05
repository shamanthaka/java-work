package com.shamanthaka.model.exception;

public class Exception2 {

    public static void main(String[] args){
        String[] nums = {"abc","12","100","9"};

            for (int i = 0; i < 5; i++) {
                try {
                    int value = Integer.parseInt(nums[i]); //converting string numbers int integer number
                    System.out.println("Value is " + value);
                }catch (NumberFormatException nfe){
                    nfe.printStackTrace();
                }catch (ArrayIndexOutOfBoundsException aibe){
                    aibe.printStackTrace();
                }
            }

        System.out.println("Completed !");
    }
}