package com.vishwas.lld.designPrinciples.DRY.badCode;

public class NumberSwapper {
    public static void main(String[] args) {
        // Non-DRY approach - repeating swap logic multiple places
        int a = 5;
        int b = 10;

        //swapping values here
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+", "+b);

        // Later in the code, need to swap different numbers
        int x = 2;
        int y = 55;

        //swapping values again
        temp = x;
        x = y;
        y = temp;
        System.out.println(x+", "+y);
    }
}
