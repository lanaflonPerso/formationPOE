package com.m2i.bank;

public class Bank {

    public static void main(String[] args) {

//          Client
        Customer jean = new Customer(5452, "Jean", "Valjean");
        Customer polo = new Customer(2145, "Paul", "Valpaul");


//          Transaction

//          Compte bancaire
        Account a1 = new Account(0, jean);
        System.out.println(Account.getNbaccount());
        Account a2 = new Account();
        System.out.println(Account.getNbaccount());
        Account a3 = new Account(0, new Customer(1, "toto", "leon"));
        System.out.println(Account.getNbaccount());





    }
}
