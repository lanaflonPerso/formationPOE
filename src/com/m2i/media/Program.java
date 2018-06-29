package com.m2i.media;

public class Program {

    public static void main(String[] args){
//        Media m = new Book("Asterix",10,40);
//        Author goscini = new Author("Goscini");
//        Author herge = new Author("hergé");
//        Publisher dargaux = new Publisher("Dargaux");
//        Publisher casterman = new Publisher("Casterman");
////
//        Book book1 = new Book("Asterix", 10, goscini, dargaux );
//        Book book2 = new Book("Tintin", 7.5, herge, dargaux);

        Media dvd1 = new DVD("The fly", 10, 100);

        Media boor = new Book("arp", 10);

        System.out.println(boor.getNetPrice());
//        System.out.println(m.getNetPrice());
        dvd1.setDiscount(20);
        System.out.println(dvd1.getCompteur());
        System.out.println(dvd1.getId());
        System.out.println(boor.getId());


        System.out.println(dvd1.getDiscount());
        System.out.println(dvd1.getNetPrice());
        System.out.println();
        System.out.println(dvd1.getDiscountPrice());
    }
}
