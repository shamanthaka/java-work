package com.shamanthaka.model.polly;

public class Circle extends Shape{

    public static final double PI = 3.14;

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return PI * this.radius * this.radius;
    }
}
