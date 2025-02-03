package models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class User {

    private String userId;
    private String name;
    private String phoneNumber;
    private Set<String> friends = new HashSet<>(); // Stores friend userIds
    private Set<String> groups = new HashSet<>(); // Stores groupIds user is part of

    public User(String userId, String name, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void addFriend(String friendId) {
        friends.add(friendId);
    }

    public String getId() { return userId; }

    public Set<String> getFriends() {
        return Collections.unmodifiableSet(friends);
    }

    public Set<String> getGroups() {
        return Collections.unmodifiableSet(groups);
    }
}
