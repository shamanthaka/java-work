package com.shamanthaka.generics;

import com.shamanthaka.model.iface.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpListTest {

    public static void main(String[] args) {
        List myList = process();

        printEmp(myList);
        printEmp2(myList);
    }

    public static void printEmp2(List myList) {
        //indexed based iteration
        for(int i = 0; i < myList.size(); i++){

            Employee e = (Employee)myList.get(i);
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }

    public static void printEmp(List<Employee> myList) {

        /*Iterator<Employee> it = myList.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }*/

        for(Employee e: myList){//for each
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }

    public static List process() {
        //to prevent run time class cast exceptions use generics

        List<Employee> list = new ArrayList<>();//generics --type is added

        Employee e = new Employee("Vinny","Veerareddy","100",12345678);
        list.add(e);
        Employee e2 = new Employee("Anitha","Veerareddy","101",145678);
        list.add(e2);
        Employee e3 = new Employee("Srijan","Veerareddy","102",1234005678);
        list.add(e3);

        Employee e4 = new Employee("Venkatram","Veerareddy","103",1989898678);
        list.add(e4);

        return list;
    }
}
