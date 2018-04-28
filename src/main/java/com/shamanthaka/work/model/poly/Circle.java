package com.shamanthaka.work.model.poly;

public class Circle extends Shape {

    private  double radius;
    public static final double PI =3.14;
    public Circle(double radius){
        this.radius=radius;

    }

    @Override
    public double area() {
        return PI* this.radius * this.radius;
    }
}
