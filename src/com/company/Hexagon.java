package com.company;

public class Hexagon extends Shape{
    private final int side1;
    private final int side2;
    private final int side3;
    private final int side4;
    private final int side5;
    private final int side6;

    public Hexagon(int side1, int side2, int side3, int side4, int side5, int side6) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }

    @Override
    public double getPerimeter() {
        perimetr = side1+side2+side3+side4+side5+side6;
        System.out.print("Perimetr of hexafon: "+perimetr);
        return 0;
    }
}
