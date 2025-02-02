public class ParkingSpot {
    
    private int spotId;
    private boolean isEmpty;
    private Vehicle vehicle;
    private double baseHourlyRate;
    private double baseMinutesRate;

    public double getBaseHourlyRate() {
        return baseHourlyRate;
    }

    public double getBaseMinutesRate() {
        return baseMinutesRate;
    }

    public int getSpotId() {
        return spotId;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle() {
        vehicle = null;
        isEmpty = true;
    }
}
