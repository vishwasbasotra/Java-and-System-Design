package com.vishwas.lld.designPrinciples.SOLID.II_OpenClosedPrinciple.goodCode;

public class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    double calculateArea() {
        return this.side*this.side;
    }
}
