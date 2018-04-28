package com.shamanthaka.work.mytest;

import com.shamanthaka.work.model.inherit.Employee;

public class EmployeInheritTest {

    public static  void main (String[] args){
        Employee e = new Employee();
        e.setFirstName("Vinny");
        e.setLastName("Veerareddy");
        e.setEmpNo("1234");
        e.setSalary(5678923);

        System.out.println(e.getFirstName() + ", " + e.getLastName() + ", " + e.getEmpNo() + ", " + e.getSalary());

        Employee e2 = new Employee("Shamanthaka", "Veerareddy","100",56434513);

        System.out.println(e2.getFirstName() + ", " + e2.getLastName() +", " +  e2.getEmpNo() + ", " + e2.getSalary());

    }
}
