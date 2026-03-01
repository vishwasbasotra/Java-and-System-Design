package com.vishwas.java.oops.abstraction;

public class Main {
    static void main(String[] args) {
        Parent p = new Son(24);
        p.career("SDE2");
        p.partner("Sonika");

        Parent.greeting();
        p.normal();
    }
}
