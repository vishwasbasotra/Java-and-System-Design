package com.vishwas.java.oops.cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int roll) {
        this.name = name;
        this.age = roll;
        this.arr = new int[]{1,2,3,4,5};
    }

    public Human(Human obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //shallow copy
        Human riddu = (Human)super.clone(); //return super.clone();

        //deep copy
        riddu.arr = new int[riddu.arr.length];
        for (int i = 0; i < riddu.arr.length; i++) {
            riddu.arr[i] = this.arr[i];
        }
        return riddu;
    }

}
