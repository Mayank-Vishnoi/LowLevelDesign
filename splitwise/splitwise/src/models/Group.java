package models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Group {
    private String id;
    private String name;
    private String createdBy;
    private Set<String> members = new HashSet<>();

    public Group(String id, String name, String createdBy) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        members.add(createdBy);
    }

    public void addMember(String userId) {
        members.add(userId);
    }

    public Set<String> getMembers() {
        return Collections.unmodifiableSet(members);
    }

    public String getId() { return id; }
}
