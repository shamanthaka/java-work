package com.shamanthaka.mytest;

import com.shamanthaka.model.iface.Person;

public class PersonTest {

    public static void main(String[] args) {
        // object creation by setter and getters
        Person p = new Person();
        p.setFirstName("Vinny");
        p.setLastName("Veerareddy");

        System.out.println(p.getFirstName() + "  " + p.getLastName());

        //object creation with arg constructor

        Person p2 = new Person("Shamanthaka", "Veerareddy");

        System.out.println(p2.getFirstName() + ", " + p2.getLastName());
    }
}
