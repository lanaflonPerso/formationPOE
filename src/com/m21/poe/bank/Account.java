package com.m21.poe.bank;

import java.util.Date;

public class Account {
    //    Attributs
    String id;
    double solde = 0;
    boolean isActive = true;
    boolean isBlocked = false;
    Date creationDate = new Date();

//    Méthodes

    void deposit(double amount) {
        if (isActive && !isBlocked) {
            solde += amount;
        }
    }

    double withdraw(double amount) {
        if (isActive && !isBlocked) {
            if ((amount <= solde)) {
                solde -= amount;
                return amount;
            } else {
                return 0;
            }
        }
        else{
            return 0;
        }
    }

    void close() {
        isActive = false;
    }

    void block() {
        isBlocked = true;
    }

    void unblock() {
        isBlocked = false;
    }
}
