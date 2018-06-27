package com.m21.poe.bank;

public class Bank {

    public static void main(String[] args){
        Account a1 = new Account();

        System.out.println(a1);
        a1.withdraw(50);
        double d = a1.withdraw(1000);
        a1.block();
        a1.deposit(100);
        System.out.println(a1);
        a1.unblock();
        a1.deposit(100);
        System.out.println(a1);
        a1.close();
        System.out.println(a1);
        a1.withdraw(300);
        System.out.println(a1);



    }
}
