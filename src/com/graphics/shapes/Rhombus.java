package com.graphics.shapes;

public class Rhombus implements Shape {
    private final int side;
    private final int height;

    public Rhombus(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String getName() {
        return "Rhombus";
    }
}
