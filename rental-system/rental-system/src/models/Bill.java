package models;

public class Bill {

    private Reservation reservation; // bill is generated against an reservation
    private boolean isPaid;
    private double amount;

    // Bill could use a CostComputation class to calculate amount against an reservation using various strategies
}
