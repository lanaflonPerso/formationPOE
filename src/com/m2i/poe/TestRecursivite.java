package com.m2i.poe;

public class TestRecursivite {


    public static int factorielle(int n){
        if (n==0 || n == 1){
            return 1;
        }
        return n * factorielle(n-1);
    }

    public static void main (String[] args){
        System.out.println(factorielle(6));

    }
}
