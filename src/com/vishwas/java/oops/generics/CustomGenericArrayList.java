package com.vishwas.java.oops.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int defaultSize = 10;
    private int size;

    public CustomGenericArrayList() {
        this.data =new Object[defaultSize];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        return (T)data[--size];
    }

    public T get(int index){
        return (T)data[index];
    }

    public int getSize(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) +
                ", size=" + size;
    }

    static void main(String[] args) {
        CustomGenericArrayList list1 = new CustomGenericArrayList();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        for (int i = 6; i <= 11; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        list1.set(1, 15);
        System.out.println(list1);

        list1.add("ada");
        System.out.println(list1);

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList();
        list2.add("ada");
        System.out.println(list2);

    }
}
