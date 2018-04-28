package com.shamanthaka.model.iface;

public class Square implements Shape {

    private double side;

    public Square(){}

    public Square(double s){
        this.side = s;
    }

    public double area(){
        return this.side * this.side;
    }

    public String toString(){
        return "[" + this.side + "]";
    }
}
