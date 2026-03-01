package com.vishwas.lld.projects.GoogleDocs.badCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<String> documentElements;
    private String renderedDocument;

    public DocumentEditor() {
        this.documentElements = new ArrayList<>();
        this.renderedDocument = "";
    }

    // add text as a plain string
    public void addText(String txt){
        documentElements.add(txt);
    }

    // add an image represented by its file path
    public void addImage(String imagePath){
        documentElements.add(imagePath);
    }

    // Renders the document by checking the type of each element at runtime
    public String renderDocument(){

        if(renderedDocument.isEmpty()){
            StringBuilder result = new StringBuilder();
            for(String element: documentElements){
                if(element.length() > 4 && (element.endsWith(".png") || element.endsWith(".jpg"))){
                    result.append("[Image: ").append(element).append("]\n");
                }else result.append(element).append("\n");
            }
            renderedDocument = result.toString();
        }
        return renderedDocument;
    }

    // Saves the document on the system
    public void saveToFile(){
        // try-with-resources automatically closes the writer for you
        try (FileWriter writer = new FileWriter("document.txt")) {
            writer.write(renderDocument());
            System.out.println("Document saved successfully!");
            // Print the absolute path so you know EXACTLY where to look
            System.out.println("File location: " + new java.io.File("document.txt").getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error: Unable to save file. " + e.getMessage());
        }
    }
}

class DocumentEditorClient{
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.addText("Hello, world!");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor");

        System.out.println(editor.renderDocument());

        editor.saveToFile();
    }
}
