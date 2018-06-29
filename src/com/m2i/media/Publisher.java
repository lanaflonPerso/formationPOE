package com.m2i.media;

public class Publisher {
    private String publisher;

    public Publisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher){this.publisher = publisher;}

    public String toString() {
        return getPublisher();
    }
}
