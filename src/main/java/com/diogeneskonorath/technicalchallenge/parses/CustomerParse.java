package com.diogeneskonorath.technicalchallenge.parses;

import com.diogeneskonorath.technicalchallenge.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerParse {
    private List<Customer> customerList = new ArrayList<>();
    public List<Customer> parseClient(String text){
        final String PATTERN = "(ç)([A-Z]|[0-9]|\\[)";
        final String REPLACE = " $2";
        String result = text.replaceAll(PATTERN,REPLACE);

        List<String> dataList = Arrays.asList(result.split("\\n"));
        for (String line : dataList ){
            if (line.contains("002")){
                customerList.add(buildCustomerObject(line));
            }
        }
        return customerList;
    }

    public Customer buildCustomerObject(String lineReaded){
        String[] parsedLine = lineReaded.split(" ");
        return new Customer(parsedLine[1], parsedLine[2], parsedLine[3]);
    }
}
