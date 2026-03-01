package com.vishwas.lld.projects.GoogleDocs.goodCode;

import java.util.ArrayList;
import java.util.List;

// Document class responsible for holding a collection of elements
public class Document {
    private List<DocumentElement> documentElements;

    public Document() {
        documentElements = new ArrayList<>();
    }

    public void addElement(DocumentElement element){
        documentElements.add(element);
    }

    // Renders the document by concatenating the render output of all elements.
    public String render(){
        StringBuilder result = new StringBuilder();
        for(DocumentElement element: documentElements){
            result.append(element.rendor());
        }

        return result.toString();
    }
}
