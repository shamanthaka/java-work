package com.shamanthaka.model;

import com.shamanthaka.model.Employee;

public class Manager extends Employee {

    protected double bonus;

    public Manager(){}

    public Manager(String firstName,String lastName, double salary, double bonus){
        //super(firstName,lastName,salary);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getBonus(){
        return  this.bonus;
    }

    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

}
