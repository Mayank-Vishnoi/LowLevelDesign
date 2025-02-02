package models;

import java.time.LocalDateTime;

import enums.ReservationStatus;

public class Reservation {

    private String reservationId;
    private User user;
    private Vehicle vehicle;
    private LocalDateTime bookedFrom;
    private LocalDateTime bookedTill;
    private Location pickupLocation;
    private ReservationStatus status;
}
