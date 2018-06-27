package com.m21.poe.bank;

public class Bank {

    public static void main(String[] args) {

//          Client
        Customer jean = new Customer(5452, "Jean", "Valjean");
        Customer polo = new Customer(2145, "Paul", "Valpaul");


//          Transaction

//          Compte bancaire
        Account a1 = new Account(0, jean);
        Account a2 = new Account();
        Account a3 = new Account(0, new Customer(1, "toto", "leon"));


        System.out.println(a1);
        a1.deposit(100);
        System.out.println(a1);
        a1.deposit(100);
        System.out.println(a1);
        a1.withdraw(150);
        System.out.println(a1);
        System.out.println(a1.getTransactionList());





    }
}
