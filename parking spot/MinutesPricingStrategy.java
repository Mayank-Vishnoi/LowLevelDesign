import java.time.Duration;
import java.time.LocalDateTime;

public class MinutesPricingStrategy implements PricingStrategy {
    
    @Override
    public double getPrice(Ticket t) {
        LocalDateTime entryTime = t.getEntryTime();
        LocalDateTime curDateTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime, curDateTime);
        long minutesElapsed = duration.toMinutes();

        return minutesElapsed * t.getParkingSpot().getBaseHourlyRate();
    }
}