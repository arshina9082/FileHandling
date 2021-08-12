package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {
        try {
            File ab = new File("TextFile.txt");
            if (ab.createNewFile()) {
                System.out.println("New File " + ab.getName() + " created");
            } else {
                System.out.println("File Already Existed");
            }

            FileWriter writer = new FileWriter("TextFile.txt");
            writer.write("This Text is added to the File\n");
            System.out.println("File updated");

            BufferedWriter bf = new BufferedWriter(writer);
            writer.write("This is the appended text");
            System.out.println("Text Appended Successfully");
            writer.close();
        }
        catch (IOException exception){
                System.out.println("Exception");
        }

    }
}
