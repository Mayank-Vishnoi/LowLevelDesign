package model;

import java.util.List;
import java.util.Map;

import enums.SeatCategory;

public class Theater {

    private String theaterId;
    private String theaterName;
    private Address address;
    private List<Audi> auditoriums; 
    private Map<SeatCategory, Double> seatPricing; // centralized pricing per theater

    public double getSeatPricing(SeatCategory seatCategory) {
        return seatPricing.get(seatCategory);
    }
}
