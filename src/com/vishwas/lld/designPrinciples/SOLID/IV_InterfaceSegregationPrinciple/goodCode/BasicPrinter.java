package com.vishwas.lld.designPrinciples.SOLID.IV_InterfaceSegregationPrinciple.goodCode;

public class BasicPrinter implements Print {
    @Override
    public void print() {
        System.out.println("Printing the document");
    }
}
