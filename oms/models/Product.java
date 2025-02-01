package oms.models;

public class Product {
    private String productId;
    private String name;
    private String price;
    private String expiryDate; // optional

    // could conduct business logic without having price/name here but for decoupling Product such that it exists independently
}
