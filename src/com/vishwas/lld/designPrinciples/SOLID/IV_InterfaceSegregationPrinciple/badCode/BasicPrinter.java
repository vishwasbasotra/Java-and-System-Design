package com.vishwas.lld.designPrinciples.SOLID.IV_InterfaceSegregationPrinciple.badCode;

public class BasicPrinter implements MultiFunctionDevice{
    @Override
    public void print() {
        System.out.println("Printing the document");
    }

    @Override
    public void scan() {
        throw new IllegalArgumentException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new IllegalArgumentException("Fax not supported");
    }
}
