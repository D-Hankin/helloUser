package com.helloUser.helloUser;

import java.util.ArrayList;

public class Group {
    
    private String groupName;
    static ArrayList<Member> members;

    public Group(String groupName) {

        this.groupName = groupName;
        Group.members = new ArrayList<>();
    }

    public static void addMember(String name, String rank, String species, String contact, int id) {
        members.add(new Member(name, rank, species, contact, id));
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
        Group.members = members;
    }

    
}
