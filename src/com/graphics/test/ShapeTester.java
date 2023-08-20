package com.graphics.test;

import com.graphics.shapes.Shape;

public class ShapeTester {
    public void testShape(Shape shape) {
        printShapeName(shape);
        printShapeArea(shape);
        printShapePerimeter(shape);
    }

    private void printShapeName(Shape shape) {
        System.out.println("\nName: " + shape.getName());
    }

    private void printShapeArea(Shape shape) {
        System.out.printf("Area: %.2f\n", shape.calculateArea());
    }

    private void printShapePerimeter(Shape shape) {
        System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());
    }
}
