package actions;

import java.util.List;

import enums.VehicleType;
import models.Store;
import models.Vehicle;

public class StoreController {
    private Store store;

    StoreController(Store store) {
        this.store = store;
    }

    public List<Vehicle> getVehiclesBasedByType(VehicleType type) {
        // lookup in store.VehicleInventoryManagement's list
        // call VehicleInventoryManagement to return vehicles based on this filter
        // user will select one and proceed for reservation
        return List.of();
    }

    // store's job to: create reservation and update reservation
    // may use methods exposed by reservation.. 
}
