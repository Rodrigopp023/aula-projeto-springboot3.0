package com.myproject.course.entities;

public class Employee {

    private String name;
    private double grossSale;

    public Employee() {
    }

    public Employee(String name, double grossSale) {
        this.name = name;
        this.grossSale = grossSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
}
