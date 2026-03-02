package com.vishwas.lld.designPatterns.creationalPatterns.singletonDesignPattern;

public enum SingletonEnum {
    INSTANCE;

    public static void doSomething(){
        System.out.println("Enum Singleton is bulletproof");
    }
}
