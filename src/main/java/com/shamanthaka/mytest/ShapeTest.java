package com.shamanthaka.mytest;

import com.shamanthaka.model.polly.Circle;
import com.shamanthaka.model.polly.Rectangle;
import com.shamanthaka.model.polly.Shape;

public class ShapeTest {
    public static void main(String[] args){
        Shape s;

        s = new Rectangle(4,5);
        double a = s.area();
        System.out.println("Area of Rectangle " + a);

        s = new Circle(9);
        a = s.area();
        System.out.println("Area of Circle " + a);
    }
}
