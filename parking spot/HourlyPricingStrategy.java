import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyPricingStrategy implements PricingStrategy {
    
    @Override
    public double getPrice(Ticket t) {
        LocalDateTime entryTime = t.getEntryTime();
        LocalDateTime curDateTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime, curDateTime);
        long hoursElapsed = duration.toHours();

        return hoursElapsed * t.getParkingSpot().getBaseHourlyRate();
    }
}
