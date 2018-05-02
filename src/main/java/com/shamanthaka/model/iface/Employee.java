package com.shamanthaka.model.iface;

public class Employee extends Person implements  Comparable<Employee>{

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

    public int compareTo(Employee that){
        if(that.salary > this.salary) return 1;
        if(this.salary < this.salary) return -1;
        return 0;
    }

    @Override
    public String toString(){
        return "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getEmpNo() + ", " + this.getSalary() +"]";
    }

    @Override
    public boolean equals(Object obj){

        Employee that = (Employee) obj;

        return this.salary == that.salary && this.empNo.equals(that.empNo)
                && this.getFirstName().equals(that.getFirstName())
                && this.getLastName().equals(that.getLastName());

    }

    public int hashCode(){
        return 5 * (int) this.salary
                + 7 * this.empNo.hashCode()
                + 11 * this.getFirstName().hashCode()
                + 13 * this.getLastName().hashCode();
    }


}
