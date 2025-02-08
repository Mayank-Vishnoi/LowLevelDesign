package model;

import java.time.LocalDateTime;
import java.util.List;

import enums.BookingStatus;

public class Booking {

    private String bookingId;
    private LocalDateTime bookingDate;
    private Show show;
    private Audi audi; // could reference through show but whatever
    private BookingStatus status;
    double totalAmount;
    List<Seat> seats;
    Payment paymentObj;

    public boolean makePayment(Payment payment) {
        if (this.status == BookingStatus.CONFIRMED) {
            System.out.println("Booking already confirmed. Payment not needed.");
            return false;
        }

        if (payment.processPayment()) {
            this.paymentObj = payment;
            this.status = BookingStatus.CONFIRMED;
            return true;
        } else {
            this.status = BookingStatus.PENDING;
            return false;
        }
    }
}
