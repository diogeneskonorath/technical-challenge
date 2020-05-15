package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Sales;
import com.diogeneskonorath.technicalchallenge.model.Salesman;

import java.util.List;

public class SalesmanService {
    public String countNumberOfSalesman(List<Salesman> salesmanList){
        return "Número de vendedores: " +salesmanList.size();
    }
}
