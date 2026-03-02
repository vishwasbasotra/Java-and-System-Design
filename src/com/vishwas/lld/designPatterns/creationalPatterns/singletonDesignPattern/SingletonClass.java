package com.vishwas.lld.designPatterns.creationalPatterns.singletonDesignPattern;

import java.io.Serial;
import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {
    // Private static variable to hold the single instance
    private static volatile SingletonClass instance; // volatile keyword ensures visibility across threads

    // Private constructor to prevent external instantiation
    private SingletonClass() {
        if (instance != null) {
            throw new RuntimeException("Create instance using getInstance() method");

        }
    }

    // Public method to provide access to the instance
    public static SingletonClass getInstance(){
        // New instance only if one doesn't exist
        if(instance == null){
            synchronized (SingletonClass.class){    // Synchronize only when creating the instance
                instance = new SingletonClass();
            }
        }
        return instance;    // Return the existing instance
    }

    @Serial
    public Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();   // returns instance clone
        return instance;    //returning same instance
    }
}
