package com.graphics.shapes;

public class Circle implements Shape {
    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
