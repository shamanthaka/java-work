package com.shamanthaka.mytest;

import com.shamanthaka.model.Employee;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name. ");
        String firstName = sc.next();
        System.out.println("Enter last name. ");
        String lasName = sc.next();
        System.out.println("Enter salary. ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(firstName,lasName,salary);

        System.out.println(emp.getFirstName() +", " + emp.getLastName() + ", "+emp.getSalary());

        Employee emp2 = new Employee("Shamanathaka","Veerareddy");

        System.out.println(emp2.getFirstName() +", " + emp2.getLastName() );
    }
}
