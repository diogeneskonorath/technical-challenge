package com.diogeneskonorath.technicalchallenge.parses;

import com.diogeneskonorath.technicalchallenge.model.Item;
import com.diogeneskonorath.technicalchallenge.model.Sales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalesParse {
    private List<Sales> salesList = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    public List<Sales> parseSales(String text){
        final String PATTERN = "(ç)([A-Z]|[0-9]|\\[)";
        final String REPLACE = " $2";
        String result = text.replaceAll(PATTERN,REPLACE);
        System.out.println("Substitution result: " + result);

        List<String> dataList = Arrays.asList(result.split("\\n"));
        for (String line : dataList ){
            if (line.contains("003")){
                salesList.add(buildSalesObject(line));
            }
        }
        return salesList;
    }

    public Sales buildSalesObject(String lineReaded){
        List<String[]> itemList = new ArrayList<>();

        String[] parsedLine = lineReaded.split(" ");
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher;

        for (String stringlToVerify :  parsedLine) {
            matcher= pattern.matcher(stringlToVerify);
            if (matcher.find()){
                String text = matcher.group(1);
                String[] it = text.split(",");
                for (String string : it){
                    itemList.add(string.split("-"));
                    for (String[] strings: itemList){
                        Item item = new Item(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Double.parseDouble(strings[2]));
                        items.add(item);
                    }

                }
            }
        }
        return new Sales(Integer.parseInt(parsedLine[1]), items , parsedLine[3]);
    }
}
