package com.m2i.media;

public class Book extends Media {
    private int pageNbr;

    public Book(String title, double price) {
        super(title, price);
        this.pageNbr = pageNbr;
    }

    @Override
    public double getDiscountPrice() {
        return (getNetPrice()*(1 - ((double)getDiscount()/100)));
    }

    public Book(String title, double price, int discount) {
        super(title, price);
        this.pageNbr = pageNbr;
        super.setDiscount(discount);
    }

    public Book(String title, double price, Author author, Publisher publisher) {
        super(title, price);
        this.pageNbr = pageNbr;
        super.addAuthors(author);
        super.setPublisher(publisher);
    }

    public Book(String title, double price, Author author, Publisher publisher, int discount) {
        super(title, price);
        this.pageNbr = pageNbr;
        super.addAuthors(author);
        super.setPublisher(publisher);
        super.setDiscount(discount);
    }

    public int getPageNbr() {
        return pageNbr;
    }

    @Override
    public double getNetPrice() {
        return this.getPrice() * 1.05;
    }

    @Override
    public String toString() {
        return super.toString() + "page number : " + getPageNbr();
    }
}
