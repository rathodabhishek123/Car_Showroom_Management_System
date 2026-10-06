package com.app;

public class Thar extends Car {

    private String variant;
    private boolean fourWheelDrive;

    public Thar(String variant,
                boolean fourWheelDrive,
                String carnumber,
                String brand,
                String model,
                String color,
                double price,
                boolean sold,
                Customer owner) {

        super(carnumber, brand, model, color, price, sold, owner);

        this.variant = variant;
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n----- Thar -----");
        System.out.println("Car Number : " + getCarnumber());
        System.out.println("Brand      : " + getBrand());
        System.out.println("Model      : " + getModel());
        System.out.println("Color      : " + getColor());
        System.out.println("Price      : " + getPrice());
        System.out.println("Variant    : " + variant);
        System.out.println("4WD        : " + fourWheelDrive);
        System.out.println("Sold       : " + isSold());
    }
}