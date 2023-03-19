/*
 Write a java program to create an abstract class named Shape that contains an empty 
method named numberOfSides(). Provide three classes named Rectangle, Triangle
and Hexagon such that each one of the classes extends the class Shape. Each one of the 
classes contains only the method numberOfSides() that shows the number of sides in the 
given geometrical structures.

 */



abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides of rectangle is 4");
    }
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides of Triangle is 3");
    }
}

class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides of Hexagon is 6");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.numberOfSides();

        Triangle t = new Triangle();
        t.numberOfSides();

        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}
