package model;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    
    private int showId;
    private Movie movie;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Audi audi;
    private List<Booking> bookings;

    public Audi getAudi() {
        return audi;
    }
}
