package com.app;

public class Scorpio extends Car {

    private String variant;
    private boolean automatic;

    public Scorpio(String variant,
                   boolean automatic,
                   String carnumber,
                   String brand,
                   String model,
                   String color,
                   double price,
                   boolean sold,
                   Customer owner) {

        super(carnumber, brand, model, color, price, sold, owner);

        this.variant = variant;
        this.automatic = automatic;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n----- Scorpio -----");
        System.out.println("Car Number : " + getCarnumber());
        System.out.println("Brand      : " + getBrand());
        System.out.println("Model      : " + getModel());
        System.out.println("Color      : " + getColor());
        System.out.println("Price      : " + getPrice());
        System.out.println("Variant    : " + variant);
        System.out.println("Automatic  : " + automatic);
        System.out.println("Sold       : " + isSold());
    }
}