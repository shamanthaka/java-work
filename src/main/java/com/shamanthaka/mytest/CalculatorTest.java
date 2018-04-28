package com.shamanthaka.mytest;

import com.shamanthaka.model.overloading.Calculator;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator c = new Calculator();

        int calc = c.add(4,5);
        System.out.println(calc);
        calc = c.add(5,6,7);
        System.out.println(calc);

        double sum = c.add(5.5,4.7);
        System.out.println(sum);
    }
}
