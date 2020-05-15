package com.diogeneskonorath.technicalchallenge.model;

import java.util.List;

public class Sales {
    private int saleId;
    private String salesmanName;
    private List<Item> items;

    public Sales(int saleId, List<Item> items, String salesmanName) {
        this.saleId = saleId;
        this.salesmanName = salesmanName;
        this.items = items;
    }

    public int getSaleId() {
        return saleId;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public List<Item> getItems() {
        return items;
    }
}
