package com.vishwas.lld.designPrinciples.SOLID.IV_InterfaceSegregationPrinciple.goodCode;

public class Main {
    public static void main(String[] args) {
        BasicPrinter basic = new BasicPrinter();
        ALLInOnePrinter proPrinter = new ALLInOnePrinter();

        basic.print();
        System.out.println("---------------------------");
        proPrinter.fax();
        proPrinter.scan();
        proPrinter.print();
    }
}
