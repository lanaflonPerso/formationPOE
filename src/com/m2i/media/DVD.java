package com.m2i.media;

public class DVD extends Media {
    private int zone;


    public DVD(String title, double price, int discount) {
        super(title, price);
        this.zone = zone;
        super.setDiscount(discount);
    }
    public DVD(String title, double price) {
        super(title, price);
        this.zone = zone;
    }

    @Override
    public double getDiscountPrice() {
        return (getNetPrice()*(1 - ((double)getDiscount()/100)));
    }

    @Override
    public double getNetPrice() {
        return getPrice()*1.2;
    }

    public int getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return super.toString() + " Zone : " + getZone();
    }
}
