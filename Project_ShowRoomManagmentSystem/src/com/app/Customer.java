package com.app;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String cid;
    private String cname;
    private String cmobile;
    private String caddress;
   
   private List<Car> carList = new ArrayList<>();

    
   public Customer(String cid,
           String cname,
           String cmobile,
           String caddress) {

	   this.cid = cid;
	   this.cname = cname;
	   this.cmobile = cmobile;
	   this.caddress = caddress;
}



	public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCmobile() {
        return cmobile;
    }

    public void setCmobile(String cmobile) {
        this.cmobile = cmobile;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    // Purchase Car
    public void purchaseCar(Car car) {

        car.setSold(true);
        car.setOwner(this);
        
        carList.add(car);

        System.out.println("Car Purchased Successfully.");
    }

    // Display Customer
    public void displayCustomer() {

        System.out.println("\nCustomer Details");
        System.out.println("--------------------------");
        System.out.println("Customer Id      : " + cid);
        System.out.println("Customer Name    : " + cname);
        System.out.println("Customer Mobile  : " + cmobile);
        System.out.println("Customer Address : " + caddress);
    }

    // Display Purchased Cars
    public void displayPurchasedCars() {

        System.out.println("\nPurchased Cars");

        if (carList.isEmpty()) {
            System.out.println("No Cars Purchased.");
            return;
        }

        for (Car car : carList) {
            car.displayDetails();
        }
    }

}