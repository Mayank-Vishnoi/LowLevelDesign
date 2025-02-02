package models;

import java.util.List;

import actions.VehicleInventoryManagement;

public class Store {

    private String storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private Location storeLocation;
    private List<Reservation> reservations;
}
