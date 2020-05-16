package com.diogeneskonorath.technicalchallenge.parses;

import com.diogeneskonorath.technicalchallenge.model.Salesman;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesmanParseTest {
    String text = "001 1234567891234 Pedro 50000";
    Salesman salesman = new Salesman("1234567891234", "Pedro", 50000);
    SalesmanParse salesmanParse = new SalesmanParse();

    @Test
    public void salesmanTest(){
        Salesman salesman1 = salesmanParse.objectSalesman(text);
        assertEquals(salesman.getName(), salesman1.getName());
    }
}