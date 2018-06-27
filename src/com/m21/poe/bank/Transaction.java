package com.m21.poe.bank;

import java.util.Date;

public class Transaction {
    private int id = 0;
    private Date creationDate = new Date();
    private double amount = 0;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(double amount){
        this.amount = amount;
    }
    public Transaction(int id, double amount){
        this.id = id;
        this.amount = amount;
    }

    public Transaction(){}

    public int getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public double getAmount() {
        return amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public String toString(){
        return "ID transaction " + id + "; Date " + creationDate + "; Montant " + amount + " from " + getFromAccount() + " to " + getToAccount() +'\n';
    }

}
