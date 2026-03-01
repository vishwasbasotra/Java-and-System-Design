package com.vishwas.java.oops.basic;

class Student{
    //instance variables
    String name;
    int age;
    int rollno;
    float marks;

    //constructor declaration
    //this is how you call a constructor from another constructor using this();
    Student(){
        this("Dustin", 16, 7, 92);
    }

    Student(String name, int age, int rollno, int marks){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.marks = marks;
    }

    //this is how you assign values of other constructor to another constructor
    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.rollno = other.rollno;
        this.marks = other.marks;
        System.out.println("This constructor function invoked!!!");
    }

    //constructor overloading with less parameters provided
    Student(int age, int rollno){
        this.age = age;
        this.rollno = rollno;
    }

    void getStudent(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Roll No :"+this.rollno);
        System.out.println("Total Marks :"+this.marks);
    }
}

public class ClassesObjectsConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 15, 21, 78);
        Student s2 = new Student("Roy", 16, 34, 82);
        Student s3 = new Student("Mike", 15, 13, 56);

        s1.getStudent();
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student random = new Student(s1);
        random.getStudent();

        Student s4 = new Student();
        s4.getStudent();

        Student s5 = new Student();
        s5 = s4;
        s4.name = "Random";
        s5.getStudent();
    }
}
