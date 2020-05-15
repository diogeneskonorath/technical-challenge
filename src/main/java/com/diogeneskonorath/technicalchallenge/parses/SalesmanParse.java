package com.diogeneskonorath.technicalchallenge.parses;

import com.diogeneskonorath.technicalchallenge.model.Salesman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesmanParse {
    private List<Salesman> salesmanList = new ArrayList<>();

    public List<Salesman> parseSalesman(String text){
        final String PATTERN = "(ç)([A-Z]|[0-9]|\\[)";
        final String REPLACE = " $2";
        String result = text.replaceAll(PATTERN,REPLACE);
        System.out.println("Substitution result: " + result);

        List<String> dataList = Arrays.asList(result.split("\\n"));
        for (String line : dataList ){
            if (line.contains("001")){
                salesmanList.add(objectSalesman(line));
            }
        }
        return salesmanList;
    }

    public Salesman objectSalesman(String lineReaded){
        String[] parsedLine = lineReaded.split(" ");
        return new Salesman(parsedLine[1], parsedLine[2],Double.parseDouble(parsedLine[3]));
    }
}
