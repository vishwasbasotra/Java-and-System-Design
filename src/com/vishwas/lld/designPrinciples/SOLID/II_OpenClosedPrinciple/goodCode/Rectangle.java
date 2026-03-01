package com.vishwas.lld.designPrinciples.SOLID.II_OpenClosedPrinciple.goodCode;

public class Rectangle extends Shape{
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return this.length * this.breadth;
    }
}
