package com.m2i.poe;

public class TestRecursivite {
    public static int factorielle(int n){
        if (n==0 || n == 1){
            return 1;
        }
        return n * factorielle(n-1);
    }
    public static int multiplication(int[] tab,int n){
        if (n == 1){
            return tab[0];
        }
        else {
            return tab[n-1] * multiplication(tab, n-1);
        }
    }
    public static void main (String[] args){
        int[] tab = {2,3,4,5,6};
        System.out.println(multiplication(tab, tab.length));
    }
}
