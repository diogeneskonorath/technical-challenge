package com.diogeneskonorath.technicalchallenge.service;

import com.diogeneskonorath.technicalchallenge.model.Item;
import com.diogeneskonorath.technicalchallenge.model.Sales;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalesServiceTest {
    SalesService salesService = new SalesService();
    double d = 0.00;
    List<Sales> salesList = new ArrayList<>();
    List<Item> itemList = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    Item item = new Item(1, 2, 20);
    Item item2 = new Item(2, 1, 10);

    @Test
    public void calculaSaleTest(){
        itemList.add(item);
        itemList.add(item2);

        assertEquals(50,salesService.calculateSale(itemList), d);
    }

    @Test
    public void theWorstSellerTest(){
        itemList.add(item);
        items.add(item2);
        Sales sales = new Sales(1, itemList, "diogenes");
        Sales sales1 = new Sales(2, items, "joao");
        salesList.add(sales);
        salesList.add(sales1);

        assertEquals("O pior vendedor é: joao",salesService.theWorstSeller(salesList));
    }

    @Test
    public void mostExpensiveSaleTest(){
        itemList.add(item);
        items.add(item2);
        Sales sales = new Sales(1, itemList, "diogenes");
        Sales sales1 = new Sales(2, items, "joao");
        salesList.add(sales);
        salesList.add(sales1);

        assertEquals("O id da venda mais cara é: 1", salesService.mostExpensiveSale(salesList));
    }
}