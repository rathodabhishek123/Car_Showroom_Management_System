package com.app;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Showroom showroom = new Showroom("Abhishek Car Showroom");

		while (true) {

			System.out.println("\n========= CAR SHOWROOM =========");
			System.out.println("1. Add Car");
			System.out.println("2. Register Customer");
			System.out.println("3. Purchase Car");
			System.out.println("4. Search Car");
			System.out.println("5. Display All Cars");
			System.out.println("6. Display Available Cars");
			System.out.println("7. Display Sold Cars");
			System.out.println("8. Display Customers");
			System.out.println("9. Display Customer Purchased Cars");
			System.out.println("10.Display Showroom");
			System.out.println("0. Exit\n");

			
			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("\nSelect Car");

				System.out.println("1. Fortuner");
				System.out.println("2. Thar");
				System.out.println("3. Scorpio");

				int type = sc.nextInt();

				System.out.print("Car Number : ");
				String number = sc.next();

				System.out.print("Brand : ");
				String brand = sc.next();

				System.out.print("Model : ");
				String model = sc.next();

				System.out.print("Color : ");
				String color = sc.next();

				System.out.print("Price : ");
				double price = sc.nextDouble();

				System.out.print("Variant : ");
				String variant = sc.next();

				System.out.print("4WD(true/false) : ");
				boolean drive = sc.nextBoolean();

				Car car = null;

				if (type == 1) {

					car = new Fortuner(variant, drive, number, brand, model, color, price, false, null);

				} else if (type == 2) {

					car = new Thar(variant, drive, number, brand, model, color, price, false, null);

				} else if (type == 3) {

					car = new Scorpio(variant, drive, number, brand, model, color, price, false, null);

				}

				showroom.getInventory().addCar(car);

				break;

			case 2:

				System.out.print("Customer Id : ");
				String id = sc.next();

				System.out.print("Customer Name : ");
				String name = sc.next();

				System.out.print("Mobile : ");
				String mobile = sc.next();

				sc.nextLine();

				System.out.print("Address : ");
				String address = sc.nextLine();

				Customer customer = new Customer(id, name, mobile, address);

				showroom.registerCustomer(customer);

				break;

			case 3:

				System.out.print("Customer Id : ");
				String cid = sc.next();

				System.out.print("Car Number : ");
				String cno = sc.next();

				showroom.purchaseCar(cid, cno);

				break;

			case 4:

				System.out.print("Enter Car Number : ");

				String search = sc.next();

				Car c = showroom.getInventory().searchCar(search);

				if (c != null) {

					c.displayDetails();

				} else {

					System.out.println("Car Not Found.");

				}

				break;

			case 5:

				showroom.displayInventory();

				break;

			case 6:

				showroom.displayAvailableCars();

				break;

			case 7:

				showroom.displaySoldCars();

				break;

			case 8:

				showroom.displayCustomers();

				break;

			case 9:

				System.out.print("Enter Customer Id : ");

				String customerId = sc.next();

				showroom.displayCustomerCars(customerId);

				break;

			case 10:

				showroom.displayShowroom();

				break;

			case 0:

				System.out.println("Thank You...");
				System.exit(0);

			default:

				System.out.println("Invalid Choice.");

			}

		}

	}

}