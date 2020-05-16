package com.diogeneskonorath.technicalchallenge.model;

public class Customer {
      private String cnpj, name, businessArea;

   public Customer(String cnpj, String name, String businessArea) {
      this.cnpj = cnpj;
      this.name = name;
      this.businessArea = businessArea;
   }

   public String getName() {
      return name;
   }
}
