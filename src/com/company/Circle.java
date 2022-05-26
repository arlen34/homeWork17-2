package com.company;

public class Circle extends Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimetr = 2 * Math.PI * radius;
        System.out.print("Perimetr Circle: "+perimetr);
        return 0;
    }


}
