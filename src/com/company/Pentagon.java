package com.company;

public class Pentagon extends Shape{
    private final int side1;
    private final int side2;
    private final int side3;
    private final int side4;
    private final int side5;

    public Pentagon(int side1, int side2, int side3, int side4, int side5) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
    }

    @Override
    public double getPerimeter() {
        perimetr= side1+side2+side3+side4+side5;
        System.out.print("Perimetr of pentagon: "+perimetr);
        return 0;
    }
}
