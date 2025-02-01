package oms.models;

import java.util.List;

public class ProductStack {
    private String productStackId;
    private String name;
    private double price;
    private List<Product> products;

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(int count) {
        // could use another strategy here, let's say based on expiry date
        while (count > 0) {
            products.remove(0);
            count--;
        }
    }
}