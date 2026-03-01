package com.vishwas.lld.designPrinciples.SOLID.II_OpenClosedPrinciple.goodCode;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(12, 11);
        Shape square = new Square(4);

        System.out.println("Area of Circle is "+circle.calculateArea());
        System.out.println("Area of Rectangle is "+rectangle.calculateArea());
        System.out.println("Area of Square is "+square.calculateArea());
    }
}
