package com.shamanthaka.model.iface;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(){}

    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }

    public double area(){
        return 1/2 * this.base * this.height;
    }

    @Override
    public String toString() {
        return "[" + this.base +", " + this.height + "]";
    }
}
