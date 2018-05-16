package com.shamanthaka.work.collections;

import com.shamanthaka.model.iface.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpListTest {
    public static void main(String[] args){
     List mylist = process();
     printEmp(mylist);
     printEmp2(mylist);
    }

    public static void printEmp(List myList){
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Employee e = (Employee)it.next();
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }

    public static void printEmp2(List myList) {
        //indexed based iteration
        for(int i = 0; i < myList.size(); i++){

            Employee e = (Employee)myList.get(i);
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }

public  static List process(){
    List list = new ArrayList();
    Employee e = new Employee("vinny","veerareddy","100",12345678);
    list.add(e);
    Employee e2 = new Employee("Anitha","veerareddy","101",1445690);
    list.add(e2);
    return list;
}
}


