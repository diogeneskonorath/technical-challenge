package com.diogeneskonorath.technicalchallenge.dao;

import com.diogeneskonorath.technicalchallenge.model.Report;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class WriteFile {

    public void writeFile(Report report, String nameFile) throws IOException {
        try {
            File file = new File(nameFile);
            FileWriter writer = new FileWriter(nameFile);
            writer.write(report.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("PATH não encontrado");
        }
    }
}
