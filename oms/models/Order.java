package oms.models;

import java.util.Map;

import oms.warehouse.Warehouse;

public class Order {

    private String orderId;
    private User user;
    private Address deliveryAddress;
    private Map<String, Integer> productStackQuantities;
    private Warehouse warehouse;
    private Invoice invoice;
    private PaymentMode paymentMode;
    private OrderStatus orderStatus;

    public Invoice getInvoice() {
        return invoice;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

}