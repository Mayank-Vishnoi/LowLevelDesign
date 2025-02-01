package oms.orders;

import oms.models.PaymentMode;

public class PaymentService {
    public void processPayment(Order order) {
        PaymentMode mode = order.getPaymentMode();
        PaymentStrategy strategy = getPaymentStrategy(mode);
        strategy.pay(order.getInvoice().getTotalAmount());
    }

    private PaymentStrategy getPaymentStrategy(PaymentMode mode) {
        return switch (mode) {
            case UPI -> new UPIPayment();
            case CREDIT_CARD -> new CreditCardPayment();
            default -> throw new IllegalArgumentException("Unsupported Payment Mode");
        };
    }
}
