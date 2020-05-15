package com.diogeneskonorath.technicalchallenge.main;

import com.diogeneskonorath.technicalchallenge.dao.ReadFile;
import com.diogeneskonorath.technicalchallenge.dao.WatchFiles;
import com.diogeneskonorath.technicalchallenge.dao.WriteFile;
import com.diogeneskonorath.technicalchallenge.model.Customer;
import com.diogeneskonorath.technicalchallenge.model.Report;
import com.diogeneskonorath.technicalchallenge.model.Sales;
import com.diogeneskonorath.technicalchallenge.model.Salesman;
import com.diogeneskonorath.technicalchallenge.parses.CustomerParse;
import com.diogeneskonorath.technicalchallenge.parses.SalesParse;
import com.diogeneskonorath.technicalchallenge.parses.SalesmanParse;
import com.diogeneskonorath.technicalchallenge.service.CustomerService;
import com.diogeneskonorath.technicalchallenge.service.SalesService;
import com.diogeneskonorath.technicalchallenge.service.SalesmanService;

import java.util.List;

public class Main {
    static final String PATH_OUT = "/home/diogenes/Documentos/git/desafio-tecnico/data/out/";
    static final String PATH_IN = "/home/diogenes/Documentos/git/desafio-tecnico/data/in/";
    public static void main(String[] args) throws Exception {
        while (true) {
            final String fileName = new WatchFiles().observer();
            if (fileName!=""){
                ReadFile readFile = new ReadFile();
                WriteFile writeFile = new WriteFile();
                CustomerParse customerParse = new CustomerParse();
                SalesmanParse salesmanParse = new SalesmanParse();
                SalesParse salesParse = new SalesParse();
                CustomerService customerService = new CustomerService();
                SalesmanService salesmanService = new SalesmanService();
                SalesService salesService = new SalesService();
                String numberOfCustomers, numberOfSalespeople, mostExpensiveSaleId, theWorstSeller;
                Report report;
                String fileReaded;

                fileReaded = readFile.readFile(PATH_IN+fileName);
                List<Customer> customerList = customerParse.parseClient(fileReaded);
                List<Salesman> salesmanList = salesmanParse.parseSalesman(fileReaded);
                List<Sales> salesList = salesParse.parseSales(fileReaded);

                numberOfCustomers = customerService.countsNumberOfCustomers(customerList);
                numberOfSalespeople = salesmanService.countNumberOfSalesman(salesmanList);
                mostExpensiveSaleId = salesService.mostExpensiveSale(salesList);
                theWorstSeller = salesService.theWorstSeller(salesList);
                report = new Report(numberOfCustomers, numberOfSalespeople, mostExpensiveSaleId, theWorstSeller);
                writeFile.writeFile(report, PATH_OUT+fileName);
            }
        }
    }
}
