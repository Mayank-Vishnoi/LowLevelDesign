import java.util.List;

public class NearestToEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {
        return parkingSpots.get(0);
        /*
            return parkingSpots.stream()
            .filter(ParkingSpot::getIsEmpty) // Only consider empty spots
            .min(Comparator.comparingInt(ParkingSpot::getDistanceFromEntrance)) // Find the nearest one
            .orElse(null); // Return null if no spot is found
         */
    }
}
