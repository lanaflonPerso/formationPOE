package com.m2i.media;

public abstract class  MediaQuantity{
    private int quantity = 1;
    Media media = null;

    public MediaQuantity(Media media){
        this.media = media;
    }

    public MediaQuantity(Media media, int quantity){
        this.media = media;
        this.setQuantity(quantity);
    }

    public double getQuantityDiscountPrice(){
        return media.getDiscountPrice() * getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 1){
            System.out.println("Quantité négative ou nulle");
        }
        else {
            this.quantity = quantity;
        }
    }
}
