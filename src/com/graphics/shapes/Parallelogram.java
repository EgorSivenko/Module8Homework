package com.graphics.shapes;

public class Parallelogram implements Shape {
    private final int base;
    private final int side;
    private final int height;

    public Parallelogram(int base, int side, int height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (base + side);
    }

    @Override
    public String getName() {
        return "Parallelogram";
    }
}
