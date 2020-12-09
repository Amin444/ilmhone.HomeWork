package com.example.contacts2;

public class Persons {
    private int id;
    private String Name;
    private  String LastName;
    private String Number;
    private  String Gmail;

    public Persons() {
    }

    public Persons(int id, String name, String lastName, String number, String gmail) {
        this.id = id;
        Name = name;
        LastName = lastName;
        Number = number;
        Gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }
}
