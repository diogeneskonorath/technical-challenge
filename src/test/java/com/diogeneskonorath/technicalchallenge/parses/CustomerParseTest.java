package com.diogeneskonorath.technicalchallenge.parses;


import com.diogeneskonorath.technicalchallenge.model.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerParseTest {
   String text = "002 2345675433444345 Eduardo Rural";
   CustomerParse customerParse = new CustomerParse();
   Customer customer = new Customer("2345675433444345", "Eduardo", "Rural");

   @Test
    public void customerTest(){
      Customer customer1 = customerParse.buildCustomerObject(text);
      assertEquals(customer.getName(), customer1.getName());
   }
}