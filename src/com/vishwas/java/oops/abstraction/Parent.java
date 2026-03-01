package com.vishwas.java.oops.abstraction;

public abstract class Parent {
    int age;

    //static method
    static void greeting(){
        System.out.println("Hello");
    }
    //normal method
    void normal(){
        System.out.println("Normal method");
    }

    abstract void career(String profession);
    abstract void partner(String name);
}

class Son extends Parent{

    public Son(int age) {
        this.age = age;
    }

    @Override
    void normal() {
        System.out.println("This is son's normal method");
    }

    @Override
    void career(String profession){
        System.out.println("I will become "+ profession);
    }

    @Override
    void partner(String name){
        System.out.println("My wife's name is "+name+" and her age is "+this.age);
    }
}