package com.shamanthaka.work.collections;

import com.shamanthaka.model.iface.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmpLLTest {


        public List process(){

            List list = new LinkedList();
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
    public static void main(String[] args){


            com.shamanthaka.collection.EmpLLTest emp = new com.shamanthaka.collection.EmpLLTest();

        List list = emp.process();

        // printEmp(list);

        printEmp2(list);
    }
    public static void printEmp2(List myList) {
        //indexed based iteration
        for(int i = 0; i < myList.size(); i++){

            Employee e = (Employee)myList.get(i);
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }
}
