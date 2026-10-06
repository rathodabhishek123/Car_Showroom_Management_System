package com.app;

public abstract class Car {

    private String carnumber;
    private String brand;
    private String model;
    private String color;
    private double price;
    private boolean sold;
    private Customer owner;

    public Car(String carnumber, String brand, String model,
               String color, double price,
               boolean sold, Customer owner) {

        this.carnumber = carnumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.sold = sold;
        this.owner = owner;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public abstract void displayDetails();
}