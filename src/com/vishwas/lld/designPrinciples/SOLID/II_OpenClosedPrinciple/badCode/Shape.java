package com.vishwas.lld.designPrinciples.SOLID.II_OpenClosedPrinciple.badCode;

public class Shape {
    private String type;
    private double area;

    public void calculateArea(String type){
        if(type.equals("circle")){
            System.out.println("Calculating circle area");
        } else if (type.equals("rectangle")) {
            System.out.println("Calculating rectangle area");
        }
    }

    public static void main(String[] args) {
        Shape shapeArea = new Shape();
        shapeArea.calculateArea("circle");
        shapeArea.calculateArea("rectangle");
    }

}
