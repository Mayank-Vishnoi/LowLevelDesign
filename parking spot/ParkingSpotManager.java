import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    private ParkingStrategy parkingStrategy;

    public ParkingSpotManager() {
        this.parkingSpots = new ArrayList<>();
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot findParkingSpace() {
        return parkingStrategy.findParkingSpot(parkingSpots);
    }

    public void addParkingSpace(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public void removeParkingSpace(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty()) {
                spot.parkVehicle(vehicle);
                return;
            }
        }
    }

    public void removeVehicle(int spotId) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotId() == spotId) {
                spot.removeVehicle();
                return;
            }
        }
    }
}
