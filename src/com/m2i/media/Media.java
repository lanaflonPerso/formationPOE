package com.m2i.media;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements IMedia {
    private static int compteur = 0;
    private int id ;
    private int discount = 0;
    private String title;
    private double price;
    private Publisher publisher;
    private List<Author> authors = new ArrayList<>();

    public Media(String title, double price) {
        this.title = title;
        this.price = price;
        this.id =
        compteur = getCompteur() + 1;
    }

    public int getCompteur(){
        return compteur;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public int getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(int discount){
        this.discount = discount;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addAuthors(Author authors) {
        this.authors.add(authors);
    }

    @Override
    public String toString() {
        return title;


    }
}
