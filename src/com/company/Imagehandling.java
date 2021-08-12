package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Imagehandling {
    public static void main(String[] args) {
        try {
            File ab = new File("C:\\Users\\ARSHINA HANIF DANGE\\Desktop\\image1.jpg");
            if (ab.createNewFile()) {
                System.out.println("New File " + ab.getName() + " created");
            }else{
                System.out.println("Existing File");
            }
            FileReader br = new FileReader(ab);
            System.out.println(ab.getAbsolutePath());
            System.out.println(ab.getAbsoluteFile());
            System.out.println(ab.canRead());
            System.out.println(ab.canWrite());
        }
        catch (IOException exception){
            System.out.println("Exception");
        }
    }
}
