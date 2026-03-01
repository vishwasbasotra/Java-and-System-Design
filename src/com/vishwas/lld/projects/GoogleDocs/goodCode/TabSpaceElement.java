package com.vishwas.lld.projects.GoogleDocs.goodCode;

// TabSpaceElement represents a tab space in the document.
public class TabSpaceElement implements DocumentElement{
    @Override
    public String rendor() {
        return "\t";
    }
}
