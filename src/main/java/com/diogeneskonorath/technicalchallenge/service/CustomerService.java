package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Customer;

import java.util.List;

public class CustomerService {
    public String countsNumberOfCustomers(List<Customer> customerList){
        return "Número de clientes: "+customerList.size();
    }
}
