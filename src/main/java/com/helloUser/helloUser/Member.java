package com.helloUser.helloUser;

public class Member {
    
    private String name;
    private String rank;
    private String species;
    private String contact;
    private int id;

    public Member(String name, String rank, String species, String contact, int id) {
        this.name = name;
        this.rank = rank;
        this.species = species;
        this.contact = contact;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    

}
