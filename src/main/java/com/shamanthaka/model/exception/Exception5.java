package com.shamanthaka.model.exception;

public class Exception5 {

    public static void main(String[] args)
    {
        try
        {
            int i = 10/0;

            System.out.println("This statement will not be executed");
        }
        catch(NullPointerException npex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}
