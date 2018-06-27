package com.m21.poe.bank;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    public Customer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(){}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return firstName + ' ' + lastName;
    }
}
