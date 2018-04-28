package com.shamanthaka.work.mytest;

import com.shamanthaka.work.model.overloading.Calc;

public class CalcTest {
    public  static void main(String[] args){
        Calc c = new Calc();
        int cal = c.add(4,5);
        System.out.println(cal);
        cal = c.add(5,6,7);
        System.out.println(cal);

        double sum = c.add(5.5,4.7);
        System.out.println(sum);



    }

}
