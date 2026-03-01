package com.vishwas.lld.projects.GoogleDocs.goodCode;

import java.io.FileWriter;
import java.io.IOException;

// FileStorage implementation of Persistence
public class FileStorage implements Persistance{
    @Override
    public void save(String data) {
        try(FileWriter writer = new FileWriter("document.txt")) {
            writer.write(data);
            writer.close();
            System.out.println("Document saved to"+ new java.io.File("document.txt").getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing");
        }
    }
}
