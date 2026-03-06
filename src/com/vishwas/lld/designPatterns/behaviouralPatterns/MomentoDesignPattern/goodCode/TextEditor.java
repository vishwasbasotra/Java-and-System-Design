package com.vishwas.lld.designPatterns.behaviouralPatterns.MomentoDesignPattern.goodCode;

/*
Undo functionality in a text editor is a feature that allows a user to reverse their last
action or actions, effectively restoring the document to a previous state.
 */

public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
