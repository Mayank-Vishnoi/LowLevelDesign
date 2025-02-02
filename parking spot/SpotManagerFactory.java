public class SpotManagerFactory {
    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerSpotManager();
            
            case FOUR_WHEELER:
                return new FourWheelerSpotManager();
            
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}

