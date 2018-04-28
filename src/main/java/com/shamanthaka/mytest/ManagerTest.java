package com.shamanthaka.mytest;

import com.shamanthaka.model.Manager;

public class ManagerTest {

    public static void main(String[] args){
        Manager manager = new Manager("Vinny","Veerareddy",123456,10);
        manager.getFirstName();

        System.out.println(manager.getFirstName() + ", " + manager.getLastName() + ", " + manager.getSalary() + ", " + manager.getBonus());
    }
}
