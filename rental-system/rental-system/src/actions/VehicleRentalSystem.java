package actions;

import java.util.List;

import models.Location;
import models.Store;
import models.User;

public class VehicleRentalSystem {
    private List<User> users;
    private List<Store> stores;
    private List<StoreController> storeControllerList; // actually interact with users

    // CRUD on users

    // CRUD on stores

    // could use a different class / strategy for this and in getStore just invoke method from that class but okay
    public Store getStore(Location location) {
        // algo to find the nearest store to this location
        return stores.get(0);
    }
}
