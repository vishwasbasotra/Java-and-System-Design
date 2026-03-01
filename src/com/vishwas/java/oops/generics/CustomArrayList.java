package com.vishwas.java.oops.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int defaultSize = 10;
    private int size;

    public CustomArrayList() {
        this.data =new int[defaultSize];
    }

    public void add(int value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int getSize(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) +
                ", size=" + size;
    }

    static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 6; i <= 11; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.set(1, 15);
        System.out.println(list);

        //list.add("ada");  it accepts only int value
    }
}
