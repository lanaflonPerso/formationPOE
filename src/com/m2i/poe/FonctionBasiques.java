package com.m2i.poe;

public class FonctionBasiques {

    public static double minimum(double[] tab){
        double mini = tab[0];
        for (double i: tab) {
            if (i < mini){
                mini = i;
            }

        }
        return mini;
    }
    public static double maximum(double[] tab){
        double maxi = tab[0];
        for (double i: tab
             ) {
            if (i > maxi){
                maxi = i;
            }

        }
        return maxi;
    }

    public static double moyenne(double[] tab){
        double somme = 0;
        for (double i:tab
             ) {somme += i;

        }
        double moyenne = somme / tab.length;
        return moyenne;
    }

    public static double somme(double[] tab){
        double somme = 0;
        for (double i:tab
             ) {somme += i;

        }
        return somme;
    }

    public static void main(String[] args){
        double[] tab = {8.1,7,6,5,4,3,2,1.1};
        System.out.println(minimum(tab));
        System.out.println(maximum(tab));
        System.out.println(moyenne(tab));
        System.out.println(somme(tab));
    }

}
