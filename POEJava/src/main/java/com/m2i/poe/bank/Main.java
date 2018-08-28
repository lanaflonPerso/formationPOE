package com.m2i.poe.bank;

public class Main {

    public static class Personne {
        public int number;
    }

    public static  class Test {
        public void x(int i, Personne p) {
            i = 3;
            p.number = 7;
        }

        public static void main(String arguments[]) {
            int x = 0;
            Personne p = new Personne();
            new Test().x(x, p);
            System.out.println(x + "" + p.number);
        }
    }

}
