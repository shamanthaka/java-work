package com.shamanthaka.model.iface;

public class Employee extends Person {

    private String empNo;
    private double salary;

    public Employee(){

    }

    public Employee(String fn, String ln, String empNo, double salary){
        super(fn, ln);
        this.empNo = empNo;
        this.salary = salary;
    }

    public Employee(String empNo, double salary){
        this.empNo = empNo;
        this.salary = salary;
    }

    public void setEmpNo(String eno){
        this.empNo = eno;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setSalary(double sal){
        this.salary = sal;
    }

    public double getSalary(){
        return this.salary;
    }
}
