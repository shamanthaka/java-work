package com.shamanthaka.model;

import java.util.Scanner;

public class Customer {

        private String firstName;
        private String lastName;
        private String  item;
        private double cost;

        public static float myInfo;

        static {
            //....
            //....
            myInfo = 54678;
        }



        public Customer(){

        }

        public Customer(String firstName, String lastName, String item, double cost){
            this.firstName = firstName;
            this.lastName = lastName;
            this.item = item;
            this.cost = cost;
        }

        public Customer(String firstName, String lastName){
            this(firstName,lastName,null,0.0d);
        }

        public String getFirstName(){
            return this.firstName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public double getCost(){
            return this.cost;
        }
        public String getItem() {
            return this.item;
        }

        public static int processSalary(){
            return 120000;
        }

        @Override
        public String toString(){
            return "[" + this.firstName +", " + this.lastName + ", "+ this.item + ", " + this.cost +"]";
        }

}

