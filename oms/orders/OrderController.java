package oms.orders;

public class OrderController {
    List<Order> orders;

    // add order
    // remove order

    public void checkout(Order o) {
        if (paymentService.processPayment(order)) {
            // remove from inventory in that warehouse
        }
        
    }
}