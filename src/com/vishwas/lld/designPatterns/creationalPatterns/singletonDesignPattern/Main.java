package com.vishwas.lld.designPatterns.creationalPatterns.singletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception, CloneNotSupportedException {
        // Fetch the single instance of the Logger
        SingletonClass instance1 = SingletonClass.getInstance();
        System.out.println(instance1.hashCode());

        // trying to make 2nd instance
//        SingletonClass instance2 = SingletonClass.getInstance();
//        System.out.println(instance2.hashCode());   // returning the same instance

        /*
        Trying to break the Singleton Design Pattern
        1. Reflection API
        Solution - Throw an exception inside the constructor if an instance already exists.
        */

//        Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonClass instance2 = constructor.newInstance();
//        System.out.println(instance2.hashCode());

        /*
        2. Serialization and Deserialization
        Solution - Implement readResolve() method
        */

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(instance1);
        System.out.println("Serialization done!");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        SingletonClass instance3 =(SingletonClass) ois.readObject();
        System.out.println(instance3.hashCode());

        /*
        3. Object Cloning
        Solution - Override the clone() method and throw an exception.
        */

        SingletonClass instance4 =(SingletonClass) instance1.clone();
        System.out.println(instance4.hashCode());

        /*
        4. Prevention Using Enum
         */

        SingletonEnum.doSomething();


    }
}
