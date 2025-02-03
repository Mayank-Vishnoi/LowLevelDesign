package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import models.Group;

public class GroupService {
    private Map<String, Group> groups = new HashMap<>();

    public Group addGroup(String name, String createdBy) {
        String id = UUID.randomUUID().toString();
        Group group = new Group(id, name, createdBy);
        groups.put(id, group);
        return group;
    }

    public void addMemberToGroup(String groupId, String userId) {
        if (!groups.containsKey(groupId)) {
            throw new IllegalArgumentException("Group not found");
        }
        groups.get(groupId).addMember(userId);
        // add to groups for that user (would need userService dependency)
    }

    public void showMembers(String groupId) {
        Optional.ofNullable(groups.get(groupId))
            .ifPresentOrElse(group -> {
                System.out.println("Members: " + String.join(", ", group.getMembers()));
                }, () -> System.out.println("No such group exists"));
    }
}
