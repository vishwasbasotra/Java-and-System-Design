package com.vishwas.lld.designPrinciples.SOLID.II_OpenClosedPrinciple.goodCode;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI* Math.pow(this.radius, 2);
    }
}
