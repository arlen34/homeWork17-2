package com.company;

public class Main {
    /**
     * public abstract double getPerimeter()
     * абстракт методун  Shape деген класска кошунуз.
     * <p>
     * Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.
     * <p>
     * <p>
     * <p>
     * Добавьте абстрактный метод
     * <p>
     * public abstract double getPerimeter()
     * в класс Shape. Реализуйте этот метод в 5 классах наследниках класса Shape.
     */
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        circle.getPerimeter();
        System.out.println();
        Triangle triangle = new Triangle(2,3,4);
        triangle.getPerimeter();
        System.out.println();
        Quadrilateral quadrilateral = new Quadrilateral(4);
        quadrilateral.getPerimeter();
        System.out.println();
        Pentagon pentagon = new Pentagon(2,3,4,3,4);
        pentagon.getPerimeter();
        System.out.println();
        Hexagon hexagon = new Hexagon(4,6,5,3,1,5);
        hexagon.getPerimeter();

    }
}
