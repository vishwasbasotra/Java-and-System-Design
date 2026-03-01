package com.vishwas.java.oops.lambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class lambdaDemo {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
//        int total = 0;
//        list.forEach((item) -> total+=item);

        list.forEach((item) -> System.out.println(item*2));

        Operation sum = (a, b) -> a + b;
        Operation substraction = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;

        lambdaDemo myCalculator = new lambdaDemo();
        System.out.println("\n"+myCalculator.operate(2,3,sum));
        System.out.println(myCalculator.operate(2,3,substraction));
        System.out.println(myCalculator.operate(2,3,multiply));

    }
    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
