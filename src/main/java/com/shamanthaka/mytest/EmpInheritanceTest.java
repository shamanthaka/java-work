package com.shamanthaka.mytest;

import com.shamanthaka.model.iface.Employee;

import java.util.Arrays;

public class EmpInheritanceTest {

    public static void main(String[] args) {
        //case 1, using setters
        Employee e = new Employee();

        e.setFirstName("Vinny");
        e.setLastName("Veerareddy");
        e.setEmpNo("1234");
        e.setSalary(123456789);

        System.out.println(e.getFirstName() + ", " + e.getLastName() + ", " + e.getEmpNo() + ", " + e.getSalary());


        //case 2

        Employee e2 = new Employee("Shamanthaka", "Veerareddy","100",56432133);

        System.out.println(e2.getFirstName() + ", " + e2.getLastName() +", " +  e2.getEmpNo() + ", " + e2.getSalary());

        //create employee array;

        Employee[] employee = new Employee[3];
        employee[0] = e;
        employee[1] = e2;
        Employee e3 = new Employee("Anitha", "Veerareddy", "1200", 878787);

        employee[2] = e3;


        Arrays.sort(employee);

        for(int i = 0; i < employee.length; i++){
            System.out.println(employee[i]);
        }

    }
}