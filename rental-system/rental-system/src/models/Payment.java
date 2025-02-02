package models;

public class Payment {
    
    private Bill bill; // payment is generated against an bill

    // Could include paymentMode enum and use strategy pattern for types of payment
    public boolean payBill() {
        return true;
    }
}
