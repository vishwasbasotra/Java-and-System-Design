package com.vishwas.java.oops.collections.vector;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // 1. Creation: default initialization is 10
        List<String> animals = new Vector<>();

        // 2. Adding elements
        animals.add("Lion");
        animals.add("Fox");
        animals.add("Deer");
        animals.add("Tiger");

        // Vector allow adding at a specific index
        animals.add(0, "Lioness");

        //3. Accessing the elements
        System.out.println("First Animal: "+animals.getFirst());
        System.out.println("Total Animals: "+animals.size());

        //4. Updating elements
        animals.set(2, "Megan Fox");

        //5. Removing elements
        animals.remove("Tiger");// By object
        animals.remove(3);

        //6. Iterating
        System.out.println("Remaining animals: ");
        for(String animal: animals){
            System.out.println("- "+animal);
        }
    }
}
