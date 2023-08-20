package com.graphics.test;

import com.graphics.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 15, 13);
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(7, 13);
        Shape square = new Square(8);
        Shape rhombus = new Rhombus(9, 5);
        Shape parallelogram = new Parallelogram(7, 10, 5);

        Shape[] shapes = { triangle, circle, rectangle, square, rhombus, parallelogram };
        ShapeTester tester = new ShapeTester();

        for (Shape shape : shapes) {
            tester.testShape(shape);
        }
    }
}
