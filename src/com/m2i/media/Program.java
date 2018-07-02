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

        Media dvd1 = new DVD("The fly", 10, 0);

        Media book = new Book("arp", 20);

        Cart cart = new Cart();


        cart.addMedia(dvd1);
        cart.addMedia(dvd1);
        cart.addMedia(dvd1);
        cart.addMedia(book);
        System.out.println(cart.getcartRowList());

        System.out.println(cart.getTotalDiscountPrice());

    }
}
