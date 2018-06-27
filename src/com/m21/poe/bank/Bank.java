package com.m21.poe.bank;

public class Bank {

    public static void main(String[] args){
        Account a1 = new Account();
        a1.solde = 5000;
        a1.deposit(100);
        System.out.println(a1.solde);
        a1.withdraw(50);
        System.out.println(a1.solde);
        double d = a1.withdraw(1000);
        System.out.println(a1.solde);
        a1.block();
        a1.deposit(100);
        System.out.println(a1.solde);
        a1.unblock();
        a1.deposit(100);
        System.out.println(a1.solde);
        a1.close();
        System.out.println(a1.solde);
        a1.withdraw(300);
        System.out.println(a1.solde);



    }
}
