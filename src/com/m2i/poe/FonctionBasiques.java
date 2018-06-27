package com.m2i.poe;

import java.util.ArrayList;
import java.util.Arrays;

public class FonctionBasiques {

    public static int minimumTab(int[] tab) {
        int mini = tab[0];
        for (int i : tab) {
            if (i < mini) {
                mini = i;
            }

        }
        return mini;
    }

    public static int maximumTab(int[] tab) {
        int maxi = tab[0];
        for (int i : tab
                ) {
            if (i > maxi) {
                maxi = i;
            }

        }
        return maxi;
    }

    public static int moyenneTab(int[] tab) {
        int somme = 0;
        for (int i : tab
                ) {
            somme += i;

        }
        int moyenne = somme / tab.length;
        return moyenne;
    }

    public static int sommeTab(int[] tab) {
        int somme = 0;
        for (int i : tab
                ) {
            somme += i;

        }
        return somme;
    }

    public static int minimum(ArrayList<Integer> aliste) {
        int mini = aliste.get(0);
        for (int i : aliste
                ) {
            if (i < mini) {
                mini = i;
            }
        }
        return mini;
    }

    public static int maximum(ArrayList<Integer> aliste) {
        int maxi = aliste.get(0);
        for (int i : aliste
                ) {
            if (i > maxi) {
                maxi = i;
            }
        }
        return maxi;
    }

    public static int somme(ArrayList<Integer> aliste) {
        int somme = 0;
        for (int i : aliste
                ) {
            somme += i;
        }
        return somme;
    }

    public static double moyenne(ArrayList<Integer> aliste) {
        int somme = 0;
        for (int i : aliste
                ) {
            somme += i;
        }
        double moyenne = somme / aliste.size();
        return moyenne;
    }

/////////////////////////////////////// primeNumber///////////////////////////////////////

    public static boolean isPrime(int n) {
        boolean result = true;
        if (n < 2) {
            result = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void primeNumb(ArrayList<Integer> aliste) {
        ArrayList<Integer> aliste2 = aliste;
        for (int i = 0; i < aliste2.size(); i++) {
            if (!isPrime(aliste2.get(i))) {
                aliste2.remove(i);
            }
        }
        for (int i : aliste2) {
            System.out.println(i);
        }
    }

    public static void primeNumb2(ArrayList<Integer> aliste) {
        for (int i = 0; i < aliste.size(); i++) {
            if (!isPrime(aliste.get(i))) {
                aliste.remove(i);
            }
        }
        for (int i : aliste) {
            System.out.println(i);
        }
    }

    public static void inverseArray(ArrayList<Integer> aliste) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = aliste.size() - 1; i > -1; i--) {
            temp.add(aliste.get(i));
            System.out.println(aliste.get(i));
        }
    }

    //    Faire une methode qui fait un add puis un remove //
    public static ArrayList<Integer> permut(ArrayList<Integer> l, int index1, int index2) {
        int temp = l.get(index1);
        l.set(index1, l.get(index2));
        l.set(index2, temp);
        return l;
    }

    public static ArrayList<Integer> inverseArray2(ArrayList<Integer> l) {
        for (int i = 0; i < ((l.size() + 1) / 2); i++) {
            l = permut(l, i, l.size() - 1 - i);
        }
        return l;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> aliste = new ArrayList<>(Arrays.asList(2, 4, 7, 8, 9, 5));
//        ArrayList<Double> aliste2 = new ArrayList<>(Arrays.asList(2.2, .2, 7.3, 8.5, 9.0, 5.0));
////        double[] tab = {8.1,7,6,5,4,3,2,1.1};
////        System.out.println(minimumTab(tab));
////        System.out.println(maximumTab(tab));
////        System.out.println(moyenneTab(tab));
////        System.out.println(sommeTab(tab));
////        System.out.println(minimum(aliste));
////        System.out.println(maximum(aliste));
////        System.out.println(moyenne(aliste));
////        System.out.println(somme(aliste));
//        primeNumb(aliste);
//        inverseArray(aliste);
        Point p1 = new Point(4,2);
        p1.display();
        p1.moveTo(1,3);
        p1.display();
        p1.moveRelative(3,5);
        p1.display();
    }
}
