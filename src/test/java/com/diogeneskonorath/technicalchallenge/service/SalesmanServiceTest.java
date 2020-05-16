package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Customer;
import com.diogeneskonorath.technicalchallenge.model.Salesman;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalesmanServiceTest {
    List<Salesman> salesmenList = new ArrayList<>();
    SalesmanService salesmanService = new SalesmanService();
    Salesman salesman = new Salesman("8557331", "diogenes", 50.50);
    Salesman salesman2 = new Salesman("8557331", "joao", 70.50);

    @Test
    public void countsNumberOfCustomersTest(){
        salesmenList.add(salesman);
        salesmenList.add(salesman2);
        assertEquals("Número de vendedores: 2", salesmanService.countNumberOfSalesman(salesmenList));
    }
}