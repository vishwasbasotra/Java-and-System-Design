package com.vishwas.java.oops.generics;

import java.util.Arrays;
import java.util.List;

// Wildcard added as T extends Number class
public class CustomWildcardArrayList<T extends Number> {
    private Object[] data;
    private static int defaultSize = 10;
    private int size;

    public CustomWildcardArrayList() {
        this.data =new Object[defaultSize];
    }

    //wildcard example
    public void getList(List<? extends Number> list){
        // do something
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

        //Genric should be Number type only, i.e,  String is not allowed
        //CustomWildcardArrayList<String> list1 = new CustomWildcardArrayList();

    }
}
