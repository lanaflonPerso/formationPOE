package com.m2i.media;

import java.util.ArrayList;

public abstract class Media {
    private static int compteur = 0;
    private int id ;
    private int discount = 0;
    private String title;
    private double price;
    private Publisher publisher;
    private ArrayList<Author> authors = new ArrayList<>();

    public Media(String title, double price) {
        this.title = title;
        this.price = price;
        this.id =
        compteur = getCompteur() + 1;
    }

    public static int getCompteur() {return  compteur;}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public abstract double getDiscountPrice();

    public abstract double getNetPrice();

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void addAuthors(Author authors) {
        this.authors.add(authors);
    }

    public String toString() {
        return title + " " + getPrice() + "€HTC";


    }
}
