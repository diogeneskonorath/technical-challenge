package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Customer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceTest {
    List<Customer> customersList = new ArrayList<>();
    CustomerService customerService = new CustomerService();
    Customer customer1 = new Customer("123456", "diogenes","dev" );
    Customer customer2 = new Customer("934587", "joao","ddi" );

    @Test
    public void countsNumberOfCustomersTest(){
        customersList.add(customer1);
        customersList.add(customer2);
        assertEquals("Número de clientes: 2", customerService.countsNumberOfCustomers(customersList));
    }
}