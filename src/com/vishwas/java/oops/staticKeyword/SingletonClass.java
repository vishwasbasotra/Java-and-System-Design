package com.vishwas.java.oops.staticKeyword;

public class SingletonClass {
    // 1. Private static variable to hold the single instance
    private static SingletonClass instance;

    // 2. Private constructor prevents 'new SingletonClass()' from other classes
    private SingletonClass() {
        System.out.println("Constructor invoked");
    }

    // 3. Public static method with 'synchronized' for thread safety
    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

class Test {
    static void main(String[] args) {
        // SingletonClass s = new SingletonClass(); //output: Error
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}