package oms.orders;

public class UPIPayment implements PaymentStrategy {
    @Override
    public boolean pay() {
        System.out.println("Processing UPI payment of $" + amount);
        return true;
    }
}
