package com.shamanthaka.innerclass;

import static com.shamanthaka.innerclass.Ex1.outerMethod;

public class Ex2 {


    static void outerMethod() {
        final int x=98;
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("x = "+x);
            }

        }
        Inner y = new Inner();
        y.innerMethod();
    }

  /* static class MethodLocalVariableDemo {
        public static void main(String[] args){
            outerMethod();
        }
    }*/


    public static void main(String[] args) {
        outerMethod();
    }
}
