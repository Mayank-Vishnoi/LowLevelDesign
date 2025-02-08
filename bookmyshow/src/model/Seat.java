package model;

import enums.SeatCategory;
import enums.SeatStatus;

public class Seat {

    private int seatId;
    private int row;
    private SeatCategory category;
    private SeatStatus status;
    private Audi audi; // to backtrack till price

    public double getPrice() {
        return audi.getTheater().getSeatPricing(category);
    }
}
