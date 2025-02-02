package models;

import enums.VehicleStatus;
import enums.VehicleType;

public class Vehicle {

    private String vehicleId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private VehicleStatus vehicleStatus;
    private double dailyRentalCost;
    private double hourlyRentalCost;
    private String companyName;
    private int kmDriven;

    // Car, Bike could extend Vehicle
}
