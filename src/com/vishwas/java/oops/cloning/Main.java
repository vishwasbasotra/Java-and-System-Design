package com.vishwas.java.oops.cloning;

import java.util.Arrays;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException {
        Human akash = new Human("Akash", 27);
        System.out.println( akash.name + " " + akash.age);

        //it is cloning the properties of one object to another
        // but is very slow as it is using new keyword
        //Human riddu = new Human(akash);

        Human riddu = (Human)akash.clone();
        System.out.println( riddu.name + " " + riddu.age);

        System.out.println("------------------------------------");
        //shallow copying and deep copying
        riddu.arr[0] = 100;
        System.out.println(Arrays.toString(akash.arr));
        System.out.println(Arrays.toString(riddu.arr));
    }
}
