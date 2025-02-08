package model;

import java.time.LocalDateTime;

import enums.PaymentStatus;

public class Payment {
    
    private String transactionId;
    private LocalDateTime paymentTime;
    private double amount;
    private PaymentStatus status;

    // this should move in a payment class and use strategy pattern as needed
    public boolean processPayment() {
        if (mockPaymentGateway()) {
            this.status = PaymentStatus.COMPLETED;
            this.paymentTime = LocalDateTime.now();
            return true;
        } else {
            this.status = PaymentStatus.DECLINED;
            return false;
        }
    }

    private boolean mockPaymentGateway() {
        return Math.random() < 0.9;
    }
}
