package com.m2i.media;

public class CartRow {
    private IMedia media = null;
    public int quantity = 1;

    public CartRow(IMedia media){
        this.media = media;
    }

    public CartRow(IMedia media, int quantity){
        this.media = media;
        this.quantity =quantity;
    }

    public double getPrice(){
        return media.getDiscountPrice() * quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void increment(){
        quantity ++;
    }

    public void decrement(){
        if (quantity > 1){
            quantity--;
        }
        else {
            System.out.println("Quantity error");
        }
    }

    public IMedia getMedia() {
        return media;
    }

    public String toString(){
        return media + " : " + quantity;
    }
}
