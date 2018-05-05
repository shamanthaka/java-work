package com.shamanthaka.model.exception;

public class Exception6 {

        public static void main(String[] args)
        {
            String[] s = {"abc", "123", null, "xyz"};

            for (int i = 0; i < 6; i++)
            {
                try
                {
                    int a = s[i].length() + Integer.parseInt(s[i]);


                }

                catch(NumberFormatException ex)
                {
                    System.out.println("NumberFormatException will be caught here");
                }

                catch (ArrayIndexOutOfBoundsException ex)
                {
                    System.out.println("ArrayIndexOutOfBoundsException will be caught here");
                }

                catch (NullPointerException ex)
                {
                    System.out.println("NullPointerException will be caught here");
                }

                System.out.println("After executing respective catch block, this statement will be executed");
            }
        }
    }
