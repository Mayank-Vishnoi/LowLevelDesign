import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    private List<ParkingSpot> twoWheelerSpots;

    public TwoWheelerSpotManager() {
        super();
    }

    public TwoWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        super(parkingSpots, parkingStrategy);
    }
}