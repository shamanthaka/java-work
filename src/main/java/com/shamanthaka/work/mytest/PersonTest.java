package com.shamanthaka.work.mytest;

import com.shamanthaka.work.model.inherit.Person;

public class PersonTest {
    public  static void main(String[] args){
        Person p = new Person();
        p.setLastName("Veerareddy");
        p.setFirstName("srijan");
        System.out.println(p.getFirstName()+ " " +p.getLastName());


        Person p2 = new Person("Shamanthaka", "Veerareddy");

        System.out.println(p2.getFirstName() + ", " + p2.getLastName());

    }
}
