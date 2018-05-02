package com.shamanthaka.model;

import java.util.Scanner;

public class Employee {

    protected String firstName;
    protected String lastName;
    protected double salary;

    public Employee(){

    }

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName){
        this(firstName,lastName,0.0d);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getSalary(){
        return this.salary;
    }



}
