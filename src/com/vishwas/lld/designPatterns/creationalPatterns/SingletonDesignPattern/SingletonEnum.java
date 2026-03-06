package com.vishwas.lld.designPatterns.creationalPatterns.SingletonDesignPattern;

public enum SingletonEnum {
    INSTANCE;

    public static void doSomething(){
        System.out.println("Enum Singleton is bulletproof");
    }
}
