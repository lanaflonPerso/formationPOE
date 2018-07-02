package com.m2i.media;

import java.util.List;

public interface IMedia {

    int getId();

    String getTitle();

    double getPrice();

    Publisher getPublisher();

    List<Author> getAuthors();

    double getDiscountPrice();

    double getNetPrice();

    int getDiscount();

    void setDiscount(int discount);

    void setPublisher(Publisher publisher);

    void addAuthors(Author authors);

    String toString();
}
