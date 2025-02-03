package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import models.User;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public User createUser(String name, String phoneNumber) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, name, phoneNumber);
        users.put(id, user);
        return user;
    }

    public void addFriend(String userId, String friendId) {
        if (!users.containsKey(userId) || !users.containsKey(friendId)) {
            throw new IllegalArgumentException("User or Friend not found");
        }
        users.get(userId).addFriend(friendId);
        users.get(friendId).addFriend(userId); // Bidirectional friendship
    }

    public void displayProfile(String userId) {
        Optional.ofNullable(users.get(userId))
                .ifPresentOrElse(user -> {
                    System.out.println("Friends: " + String.join(", ", user.getFriends()));
                    System.out.println("Groups: " + String.join(", ", user.getGroups()));
                }, () -> System.out.println("User not found!"));
    }
}
