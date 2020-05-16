package com.diogeneskonorath.technicalchallenge.parses;

import com.diogeneskonorath.technicalchallenge.model.Item;
import com.diogeneskonorath.technicalchallenge.model.Sales;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalesParseTest {
    String text = "003 1 [1-10-100] diogenes";
    SalesParse salesParse = new SalesParse();
    List<Item> itemList = new ArrayList<>();
    Item item = new Item(1,10, 100);

    @Test
    public void salesTest(){
        itemList.add(item);
        Sales sales = new Sales(1, itemList, "diogenes");
        Sales sales1 = salesParse.buildSalesObject(text);
        assertEquals(sales.getSaleId(), sales1.getSaleId());
    }
}