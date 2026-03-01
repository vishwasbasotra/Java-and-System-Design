package com.vishwas.lld.projects.GoogleDocs.goodCode;

// DocumentEditor class managing client interactions
public class DocumentEditor {
    private Document document;
    private Persistance storage;
    private String renderedDocument;

    public DocumentEditor(Document document, Persistance storage) {
        this.document = document;
        this.storage = storage;
        this.renderedDocument = "";
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine(){
        document.addElement(new NewLineElement());
    }

    public void addTabSpace(){
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument(){
        if(renderedDocument.isEmpty()){
            renderedDocument += document.render();
        }
        return renderedDocument;
    }

    public void saveDocument(){
        storage.save(renderDocument());
    }
}
