package com.diogeneskonorath.technicalchallenge.model;

public class Salesman {
    private String name, cpf;
    private double salary;
    private double salesValue;

    public Salesman(String cpf, String name, double salary) {
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
