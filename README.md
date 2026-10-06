# Car Showroom Management System

A console-based **Car Showroom Management System** developed using **Core Java, Object-Oriented Programming, and Java Collection Framework**.

The application manages cars, customers, showroom inventory, and car purchases through a menu-driven console interface.

## Features

- Add Car
- Register Customer
- Purchase Car
- Search Car
- Display All Cars
- Display Available Cars
- Display Sold Cars
- Display Customers
- Display Customer Purchased Cars
- Display Showroom Details

## Car Types

The system currently supports:

- Fortuner
- Thar
- Scorpio

## Car Details

The application stores information such as:

- Car Number
- Brand
- Model
- Color
- Price
- Variant
- 4WD
- Car Availability
- Customer Purchase Details

## Customer Details

The application manages:

- Customer ID
- Customer Name
- Mobile Number
- Address
- Purchased Cars

## Application Menu

```text
========= CAR SHOWROOM =========

1. Add Car
2. Register Customer
3. Purchase Car
4. Search Car
5. Display All Cars
6. Display Available Cars
7. Display Sold Cars
8. Display Customers
9. Display Customer Purchased Cars
10. Display Showroom
0. Exit
```

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Java Collection Framework
- Eclipse IDE

## OOP Concepts Used

### Inheritance

The project contains different car types derived from the main `Car` class.

```text
Car
├── Fortuner
├── Thar
└── Scorpio
```

### Polymorphism

The project uses a parent `Car` reference to store different child class objects.

```java
Car car = null;

car = new Fortuner(...);
car = new Thar(...);
car = new Scorpio(...);
```

This demonstrates **runtime polymorphism** and **upcasting**.

### Encapsulation

The project uses separate classes to encapsulate car, customer, inventory, and showroom information.

### Collection Framework

The inventory manages multiple car objects using Java Collection Framework concepts.

Collections provide:

- Dynamic storage
- Object management
- Searching
- Iteration
- Adding and retrieving objects

## Project Structure

```text
Car_Showroom_Management_System
│
└── src
    └── com.app
        │
        ├── Car.java
        ├── Customer.java
        ├── Fortuner.java
        ├── Thar.java
        ├── Scorpio.java
        ├── Inventory.java
        ├── Showroom.java
        └── Test.java
```

## Main Classes

### Car

Base class containing common car information and behaviour.

### Fortuner

Represents the Fortuner car type.

### Thar

Represents the Thar car type.

### Scorpio

Represents the Scorpio car type.

### Customer

Stores customer information and purchase details.

### Inventory

Manages the showroom's collection of cars.

Main operations include:

- Add car
- Search car
- Display all cars
- Display available cars
- Display sold cars

### Showroom

Manages showroom operations including:

- Customer registration
- Car purchase
- Inventory management
- Customer purchased cars
- Showroom information

### Test

The `Test` class contains the main method and provides the menu-driven console interface.

## How to Run

1. Clone or download the repository.
2. Open Eclipse IDE.
3. Import the project into Eclipse.
4. Open `Test.java`.
5. Run it as a Java Application.
6. Select an option from the menu.
7. Follow the instructions displayed in the console.

## Example

```text
========= CAR SHOWROOM =========

1. Add Car
2. Register Customer
3. Purchase Car
4. Search Car
5. Display All Cars
6. Display Available Cars
7. Display Sold Cars
8. Display Customers
9. Display Customer Purchased Cars
10. Display Showroom
0. Exit

Enter Choice:
```

## Learning Objectives

This project provides practical experience with:

- Core Java
- OOP concepts
- Inheritance
- Polymorphism
- Encapsulation
- Collection Framework
- Object management
- Searching objects
- Menu-driven applications
- User input using Scanner

## Future Improvements

The project can be enhanced with:

- MySQL database integration
- JDBC
- Login and authentication
- Payment processing
- Car booking system
- Update and delete operations
- Advanced search and filtering
- Exception handling
- Spring Boot REST API
- Web-based user interface

## Author

**Abhishek Rathod**

Computer Science & Engineering Graduate

## License

This project is created for learning and educational purposes.
