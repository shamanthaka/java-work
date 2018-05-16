package com.shamanthaka.model.exception;

public class Exception4 {

    public static void main(String[] args)
    {
        try
        {
            String s = null;

            System.out.println(s.length());

            System.out.println("This statement will not be executed");
        }
        catch(NullPointerException npex)
        {
            System.out.println(npex.getMessage());

            npex.printStackTrace();
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}
