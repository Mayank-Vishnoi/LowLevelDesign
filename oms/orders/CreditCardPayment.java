package oms.orders;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay() {
        System.out.println("Processing Credit Card payment of $" + amount);
        return true;
    }
}