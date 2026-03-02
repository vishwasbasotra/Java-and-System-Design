package com.vishwas.java.oops.generics.comparingObjects;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(105, "Alice"));
        students.add(new Student(101, "Zayn"));
        students.add(new Student(103, "Charlie"));

        // ---Using compareTo()---
        if(students.get(0).compareTo(students.get(1)) > 0){
            System.out.println(students.get(0).name + " has more marks");
        }else System.out.println(students.get(1).name + " has more marks");

        // --- Using Comparable (Natural Order: Roll No) ---
        Collections.sort(students);
        System.out.println("Sorted by Roll (Comparable):");
        System.out.println(students);

        // --- Using Comparator (Custom Order: Name) ---
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name (Comparator):");
        System.out.println(students);

        // --- Using Lambda (Modern Java way to use Comparator) ---
        students.sort((s1, s2) -> s1.name.length() - s2.name.length());
        System.out.println("\nSorted by Name Length (Lambda Comparator):");
        System.out.println(students);
    }
}