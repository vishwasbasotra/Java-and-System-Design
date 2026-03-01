package com.vishwas.java.oops.generics.comparingObjects;

import java.util.*;

// 1. Comparable: Defined inside the class
class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Default sorting logic: By Roll Number
    @Override
    public int compareTo(Student other) {
        return this.roll - other.roll;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name='" + name + '\'' + '}';
    }
}

// 2. Comparator: Defined as a separate class for custom sorting
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
