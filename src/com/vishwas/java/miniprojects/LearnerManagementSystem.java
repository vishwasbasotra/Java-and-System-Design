package com.vishwas.java.miniprojects;

import java.util.Scanner;
class Student{
    String name;
    int age;
    long marks;

    Student(String name, int age, long marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Total Marks: "+this.marks);
    }

    public float getMarks(){
        return marks;
    }
}
public class LearnerManagementSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select options from below");
        System.out.println("1. To add a new student");
        System.out.println("2. Print details of all the students");
        System.out.println("3. Print average marks");
        Student s1 = new Student("Sonika", 24, 95);
        Student s2 = new Student("Vishwas", 28, 90);
        Student s3 = new Student("Paras", 23, 80);

        int n = sc.nextInt();
        while(true){
            try{
                if(n == 1){
                    //System.out.print("Enter custom student id: ");

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    System.out.print("Total Marks: ");
                    int marks = Math.toIntExact(sc.nextLong());

                    Student s = new Student(name, age, marks);
                    s.printDetails();
                    break;
                } else if (n==2) {
                    s1.printDetails();
                    s2.printDetails();
                    s3.printDetails();
                    break;
                } else if (n==3) {
                    System.out.print("Avg marks: "+(s1.marks+s1.marks+s3.marks)/3);
                    break;
                }
            }catch (Exception e){
                System.out.print("Invalid option: "+e.getMessage());
            }
        }
    }
}
