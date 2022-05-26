package com.company;

public class Quadrilateral extends Shape{
    private final int  side;

    public Quadrilateral(int side) {
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        perimetr= 4*side;
        System.out.print("Perimetr of quadrilateral: "+perimetr);
        return 0;
    }
}
