package com.vishwas.lld.designPrinciples.SOLID.IV_InterfaceSegregationPrinciple.goodCode;

public class ALLInOnePrinter implements Print,Fax,Scan {
    @Override
    public void print() {
        System.out.println("Printing the document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the document");
    }

    @Override
    public void fax() {
        System.out.println("Faxing the document");
    }
}
