package com.vehicle.calling;

import com.vehicle.details.Vehicle;

public class VehicleCaller {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		String brand1 = vehicle.brand = "BMW";
        String model1 = vehicle.model = "X5";
        String type1 = vehicle.type = "SUV";
        int year1 = vehicle.year = 2023;
        String fuel1 = vehicle.fuelType = "Diesel";
        double mileage1 = vehicle.mileage = 15.8;
        double price1 = vehicle.price = 8200000.00;
        String color1 = vehicle.color = "Black";
        int seat1 = vehicle.seatingCapacity = 7;
        boolean electric1 = vehicle.isElectric = false;

        System.out.println("Brand: " + vehicle.brand);
        System.out.println("Model: " + vehicle.model);
        System.out.println("Type: " + vehicle.type);
        System.out.println("Year: " + vehicle.year);
        System.out.println("Fuel Type: " + vehicle.fuelType);
        System.out.println("Mileage: " + vehicle.mileage);
        System.out.println("Price: " + vehicle.price);
        System.out.println("Color: " + vehicle.color);
        System.out.println("Seating Capacity: " + vehicle.seatingCapacity);
        System.out.println("Is Electric: " + vehicle.isElectric);
    
	}

}
