package com.vishwas.java.oops.inheritance.intro;

public class InheritanceIntro {
    long l;
    long h;
    long b;

    public InheritanceIntro(long l, long h, long b) {
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public InheritanceIntro(long l, long h) {
        this.l = l;
        this.h = h;
    }

    public InheritanceIntro() {
        this.l = -1;
        this.h = -1;
        this.b = -1;
    }
}

class test extends InheritanceIntro{
    long diagonal;
    long area;

    public test() {
        this.diagonal = -1;
    }

    public test(long l, long h, long b, long diagonal) {
        // parent constructor invoked first
        super(l, h, b);
        this.diagonal = diagonal;
    }

    public long calculateArea() {
        this.area = l*b*h;
        return this.area;
    }
}
