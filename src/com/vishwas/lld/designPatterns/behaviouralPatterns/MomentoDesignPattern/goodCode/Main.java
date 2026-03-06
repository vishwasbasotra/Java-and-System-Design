package com.vishwas.lld.designPatterns.behaviouralPatterns.MomentoDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setContent("Hello world!");
        editor.setContent("Hello everyone!");

        //Problem - undo the last write

        System.out.println(editor.getContent());
    }
}
