import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager {

    private List<ParkingSpot> fourWheelerSpots;

    public FourWheelerSpotManager() {
        super();
    }

    public FourWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        super(parkingSpots, parkingStrategy);
    }
}
