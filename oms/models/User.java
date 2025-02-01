package oms.models;

import java.util.List;

import oms.users.Cart;

public class User {
    private String userId;
    private String name;
    private Cart cart;
    private List<String> orderIds;
}
