package com.diogeneskonorath.technicalchallenge.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public String readFile(String path) throws IOException {
        String text="";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader read = new BufferedReader(fileReader);
            String line = "";
            line = read.readLine();
            while (line != null) {
                text += line + "\n";
                line = read.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IOException("File not found");
        }
        return text;
    }

}
