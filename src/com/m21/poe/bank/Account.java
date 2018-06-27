package com.m21.poe.bank;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    //    Attributs
    private int id  = 0;
    private double solde = 0;
    private boolean isActive = true;
    private boolean isBlocked = false;
    private Date creationDate = new Date();
    private ArrayList<Transaction> transactionList = new ArrayList<>();
    private Customer customer;

//    Méthodes

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public Account(){

    }

    public void deposit(double amount) {
        if (isActive() && !isBlocked()) {
            solde = (getSolde() + amount);
            Transaction transaction = new Transaction(amount);
            transaction.setFromAccount(null);
            transaction.setToAccount(this);
            transactionList.add(transaction);
        }
    }

    double withdraw(double amount) {
        if (isActive() && !isBlocked()) {
            if ((amount <= getSolde())) {
                solde = (getSolde() - amount);
                Transaction transaction = new Transaction(-amount);
                transaction.setFromAccount(this);
                transaction.setToAccount(null);
                transactionList.add(transaction);
                return amount;
            } else {
                return 0;
            }
        }
        else{
            return 0;
        }
    }

    public void close() {
        isActive = false;
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }

//    GETTER & SETTER
    public int getId() {
        return id;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString(){
        return "le solde est : " + getSolde() + " le client est : " + this.customer.getFirstName() + " " + this.customer.getLastName();
    }

}
