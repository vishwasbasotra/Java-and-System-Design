package com.vishwas.lld.projects.GoogleDocs.goodCode;

// NewLineElement represents a line break in the document.
public class NewLineElement implements DocumentElement{
    @Override
    public String rendor() {
        return "\n";
    }
}
