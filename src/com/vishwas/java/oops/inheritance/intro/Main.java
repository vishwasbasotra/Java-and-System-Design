package com.vishwas.java.oops.inheritance.intro;

public class Main {
    static void main(String[] args) {
//        InheritanceIntro I = new InheritanceIntro();
//        System.out.println(I.l);

        // as soon as this object is created the constructor of parent class will be invoked first.
        test t1 = new test();
        System.out.println(t1.l);

        // on creating this object the child constructor first calls the parent constructor by passing all the
        // required parameters that are passed during the child object creation to initialize the parent attributes first.
        test t2 = new test(12, 8, 5, 14);
        System.out.println("Area: "+t2.calculateArea()+"m square");

        InheritanceIntro i = new test(12, 4, 2,  34);
        System.out.println(i.l);
    }
}
