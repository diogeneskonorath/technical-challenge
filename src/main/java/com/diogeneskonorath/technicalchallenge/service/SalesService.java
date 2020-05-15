package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Item;
import com.diogeneskonorath.technicalchallenge.model.Sales;
import com.diogeneskonorath.technicalchallenge.model.Salesman;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesService {
    private double comparator = Double.MAX_VALUE;
    public String mostExpensiveSale(List<Sales> salesList){
        String saleMostExpensive="Não há uma venda mais cara";
        double saleValue=0;
        double comparator=0;
        for( Sales sales : salesList){
           saleValue = calculateSale(sales.getItems());
           if (saleValue>comparator){
               comparator = saleValue;
               saleMostExpensive = "O id da venda mais cara é: "+sales.getSaleId();
           }
        }
        return saleMostExpensive;
    }

    public String theWorstSeller(List<Sales> salesList){
        String worstSalesman = "Não há um pior vendedor";
        Map<String, Double> salesBySalesman = new HashMap<>();
        String saleMostExpensive;
        double saleValue=0;
        for( Sales sales : salesList){
            saleValue = calculateSale(sales.getItems());
            salesBySalesman.put(sales.getSalesmanName(), salesBySalesman.getOrDefault(sales.getSalesmanName(), 0.0) + saleValue);
        }
        for (Map.Entry<String, Double> entry : salesBySalesman.entrySet()){
            if (comparator>entry.getValue()){
                worstSalesman= entry.getKey();
            }
        }
        return "O pior vendedor é: "+worstSalesman;
    }

    public double calculateSale(List<Item> itemList){
        double calc=0;
        double result=0;
        for (Item item : itemList){
            calc = item.getItemQuantity()*item.getItemPrice();
            result +=calc;
        }
        return result;
    }
}
