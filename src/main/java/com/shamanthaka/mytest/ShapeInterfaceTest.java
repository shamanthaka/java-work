package com.shamanthaka.mytest;

import com.shamanthaka.model.iface.Shape;
import com.shamanthaka.model.iface.Square;
import com.shamanthaka.model.iface.Triangle;

public class ShapeInterfaceTest {

    public static void main(String[] args){
        Shape triangle = new Triangle(5,6);

        double ta = triangle.area();

        System.out.println("Triable area " + ta);

        Shape square = new Square(8);
        double sa = square.area();

        System.out.println("Square are " + sa);
    }
}
