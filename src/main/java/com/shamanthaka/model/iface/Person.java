package com.shamanthaka.model.iface;

public class Person {

    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }

    public String getLastName() {
        return lastName;
    }
}
