package com.app;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Car> cars;

    //constructor
    public Inventory() {
        cars = new ArrayList<>();
    }

    //getter-setter
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    
    
    
    // Add Car
    public void addCar(Car car) {

        cars.add(car);
        System.out.println("Car Added Successfully.");
    }

    // Remove Car
    public void removeCar(String carNumber) {

        Car car = searchCar(carNumber);

        if (car != null) {
            cars.remove(car);
            System.out.println("Car Removed Successfully.");
        } else {
            System.out.println("Car Not Found.");
        }
    }

    // Search Car
    public Car searchCar(String carNumber) {

        for (Car car : cars) {

            if (car.getCarnumber().equalsIgnoreCase(carNumber)) {
                return car;
            }

        }

        return null;
    }

    // Display All Cars
    public void displayAllCars() {

        if (cars.isEmpty()) {
            System.out.println("No Cars Available.");
            return;
        }

        System.out.println("\n------ All Cars ------");

        for (Car car : cars) {
            car.displayDetails();
        }
    }

    // Display Available Cars
    public void displayAvailableCars() {

        boolean found = false;

        System.out.println("\n------ Available Cars ------");

        for (Car car : cars) {

            if (!car.isSold()) {

                car.displayDetails();
                found = true;
            }

        }

        if (!found) {
            System.out.println("No Available Cars.");
        }

    }

    // Display Sold Cars
    public void displaySoldCars() {

        boolean found = false;

        System.out.println("\n------ Sold Cars ------");

        for (Car car : cars) {

            if (car.isSold()) {

                car.displayDetails();
                found = true;
            }

        }

        if (!found) {
            System.out.println("No Sold Cars.");
        }

    }

    // Total Cars
    public int totalCars() {

        return cars.size();
    }

}
