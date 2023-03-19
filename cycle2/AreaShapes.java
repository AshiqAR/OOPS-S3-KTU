
/*
Write a Java program to calculate the area of different shapes namely circle, rectangle, 
 and triangle using the concept of method overloading.
*/

import java.lang.Math;

public class AreaShapes{
    static void area(float r){
        System.out.println("Circle");
        System.out.println("Radius = "+r);
        System.out.println("Area = "+3.14*r*r);
    }
    static void area(float l,float b){
        System.out.println("Rectangle");
        System.out.println("length = "+l+", breadth = "+b);
        System.out.println("Area = "+l*b);
    }
    static void area(float a,float b,float c){
        float s = (a+b+c)/2;
        System.out.println("Triangle");
        System.out.println("Sides = "+a+", "+b+", "+c);
        System.out.println("Area = "+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public static void main(String args[]){
        // Circle
        area(2);
        System.out.println();
        // Rectangle
        area(3,5);
        System.out.println();
        // Triangle
        area(3,4,5);
    }
}
