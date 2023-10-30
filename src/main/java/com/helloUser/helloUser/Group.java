package com.helloUser.helloUser;

import java.util.ArrayList;

public class Group {
    
    private String groupName;
    ArrayList<Member> members;

    public Group(String groupName) {

        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    public void addMember(String name, String rank, String species, String contact) {
        members.add(new Member(name, rank, species, contact));
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    
}
