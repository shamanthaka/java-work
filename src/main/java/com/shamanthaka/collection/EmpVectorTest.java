package com.shamanthaka.collection;

import com.shamanthaka.model.iface.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EmpVectorTest {

    public  List process() {

        List list = new Vector();
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
        EmpVectorTest test = new EmpVectorTest();
        List list = test.process();

        Iterator it = list.iterator();
        while(it.hasNext()){
            Employee e = (Employee)it.next();
            System.out.println(e.getFirstName() + "  " + e.getSalary());
        }
    }
}
