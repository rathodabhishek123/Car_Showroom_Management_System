
package com.app;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    private String showroomName;
    private Inventory inventory;
    private List<Customer> customers;

    public Showroom(String showroomName) {

        this.showroomName = showroomName;
        this.inventory = new Inventory();
        this.customers = new ArrayList<>();
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    // Register Customer
    public void registerCustomer(Customer customer) {

        customers.add(customer);
        System.out.println("Customer Registered Successfully.");
    }

    // Search Customer
    public Customer searchCustomer(String customerId) {

        for (Customer customer : customers) {

            if (customer.getCid().equalsIgnoreCase(customerId)) {
                return customer;
            }

        }

        return null;
    }

    // Purchase Car
    public void purchaseCar(String customerId, String carNumber) {

        Customer customer = searchCustomer(customerId);
        Car car = inventory.searchCar(carNumber);

        if (customer == null) {
            System.out.println("Customer Not Found.");
            return;
        }

        if (car == null) {
            System.out.println("Car Not Found.");
            return;
        }

        if (car.isSold()) {
            System.out.println("Car Already Sold.");
            return;
        }

        customer.purchaseCar(car);

        System.out.println("Purchase Successful.");
    }

    // Display Customers
    public void displayCustomers() {

        if (customers.isEmpty()) {

            System.out.println("No Customers Found.");
            return;
        }

        for (Customer customer : customers) {

            customer.displayCustomer();
            System.out.println();
        }
    }

    // Display Inventory
    public void displayInventory() {

        inventory.displayAllCars();
    }

    // Display Available Cars
    public void displayAvailableCars() {

        inventory.displayAvailableCars();
    }

    // Display Sold Cars
    public void displaySoldCars() {

        inventory.displaySoldCars();
    }

    // Display Purchased Cars of Customer
    public void displayCustomerCars(String customerId) {

        Customer customer = searchCustomer(customerId);

        if (customer == null) {

            System.out.println("Customer Not Found.");
            return;
        }

        customer.displayPurchasedCars();
    }

    // Showroom Details
    public void displayShowroom() {

        System.out.println("\n========== SHOWROOM ==========");
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Total Cars    : " + inventory.totalCars());
        System.out.println("Customers     : " + customers.size());
    }

}
