package com.m2i.media;

public class CD extends Media {
    private int trackNbr;

    public CD(String title, double price, int trackNbr, int discount) {
        super(title, price);
        this.trackNbr = trackNbr;
        super.setDiscount(discount);
    }
    public CD(String title, double price, int trackNbr) {
        super(title, price);
        this.trackNbr = trackNbr;
    }

    public int getTrackNbr() {
        return trackNbr;
    }

    @Override
    public String toString() {
        return super.toString() + " Track nbr : " + getTrackNbr();
    }
}
