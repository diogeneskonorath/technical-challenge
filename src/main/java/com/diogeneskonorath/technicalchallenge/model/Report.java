package com.diogeneskonorath.technicalchallenge.model;

public class Report {
    private String numberOfCustomers;
    private String numberOfSalespeople;
    private String mostExpensiveSaleId;
    private String theWorstSeller;

    public Report(String numberOfCustomers, String numberOfSalespeople, String mostExpensiveSaleId, String theWorstSeller) {
        this.numberOfCustomers = numberOfCustomers;
        this.numberOfSalespeople = numberOfSalespeople;
        this.mostExpensiveSaleId = mostExpensiveSaleId;
        this.theWorstSeller = theWorstSeller;
    }

    @Override
    public String toString() {
        return "Report{" +
                "numberOfCustomers='" + numberOfCustomers + '\'' +
                ", numberOfSalespeople='" + numberOfSalespeople + '\'' +
                ", mostExpensiveSaleId='" + mostExpensiveSaleId + '\'' +
                ", theWorstSeller='" + theWorstSeller + '\'' +
                '}';
    }
}
