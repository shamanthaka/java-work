package com.shamanthaka.mytest;

import com.shamanthaka.model.Customer;

import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name. ");
        String firstName = sc.next();
        System.out.println("Enter last name. ");
        String lastName = sc.next();
        System.out.println("Enter the item");
        String item = sc.next();
        System.out.println("Enter cost ");
        double cost = sc.nextDouble();

        float someInfo = Customer.myInfo;

        System.out.println("Some info " + someInfo);

        float sal = Customer.processSalary();

        Customer cust = new Customer(firstName,lastName,item,cost);

        System.out.println("Customer " + cust.getFirstName() +", " + cust.getLastName() +", " + cust.getItem() + ", " + cust.getCost());

        System.out.println("Object is " + cust);



    }
}
