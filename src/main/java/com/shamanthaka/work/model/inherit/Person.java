package com.shamanthaka.work.model.inherit;

public class Person {
    private String firstName;
    private String lastName;
    public Person(){

    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }
    public String getLastName(){
        return this.lastName;
    }

}


