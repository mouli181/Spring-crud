package main;

import Shapes.Circle;
import Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area " + c.calculate());

        Rectangle r= new Rectangle(10,20);
        System.out.println("Rectangle area " + r.cal());
    }
}
