package com.shamanthaka.innerclass;

public class Ex1 {

    static void outerMethod(){
        System.out.println("outer method.");
    }

    void outerMethod2(){
        System.out.println("outer method2");
    }

    static class Inner {

        public static void main(String[] args) {
            outerMethod();


            Ex1 ex = new Ex1();
            ex.outerMethod2();

            System.out.println("Hello");
        }

    }
}
