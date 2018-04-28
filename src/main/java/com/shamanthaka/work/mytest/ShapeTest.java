package com.shamanthaka.work.mytest;

import com.shamanthaka.work.model.poly.Circle;
import com.shamanthaka.work.model.poly.Rectangle;
import com.shamanthaka.work.model.poly.Shape;

public class ShapeTest {
    public  static  void main(String[] args){
        Shape s;

        s= new Rectangle(3,5);
        double a = s.area();
        System.out.println("Area of Rectangle" + a);


        s= new Circle(4) ;
         a = s.area();System.out.println("Area of Circle" +a);

    }

}
