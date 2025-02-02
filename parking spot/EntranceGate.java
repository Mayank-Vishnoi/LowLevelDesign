public class EntranceGate {
    private ParkingSpotManager parkingSpotManager;

    private ParkingSpot getParkingSpace(VehicleType vehicleType) {
        ParkingSpotManager parkingSpotManager = SpotManagerFactory.getParkingSpotManager(vehicleType);
        return parkingSpotManager.findParkingSpace();
    }

    public void bookSpot(Vehicle v) {
        // 
    }

    public Ticket generateTicket(Vehicle v, ParkingSpot spot) {
        return null;
    }
}
