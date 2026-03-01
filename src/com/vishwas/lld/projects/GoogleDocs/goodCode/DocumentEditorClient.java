package com.vishwas.lld.projects.GoogleDocs.goodCode;

// Client usage example
public class DocumentEditorClient {
    public static void main(String[] args) {
        Document document = new Document();
        Persistance persistance = new FileStorage();
        DocumentEditor editor = new DocumentEditor(document, persistance);

        //Simulate a client using the editor with common text formatting features.

        editor.addText("Hello, World!");
        editor.addNewLine();
        editor.addText("this is a real world document editor.");
        editor.addTabSpace();
        editor.addText("Added a tab space");
        editor.addNewLine();
        editor.addImage("picture.jpg");

        // Render and display the final document
        System.out.println(editor.renderDocument());
        editor.saveDocument();
    }
}
