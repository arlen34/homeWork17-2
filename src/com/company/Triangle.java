package com.company;

public class Triangle extends Shape{
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double getPerimeter() {
        perimetr = side1+side2+side3;
        System.out.print("Perimetr triangle: "+perimetr);
        return 0;
    }


}
