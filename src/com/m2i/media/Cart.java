package com.m2i.media;

import java.util.*;

public class Cart {
    private Set<CartRow> cartRowList = new LinkedHashSet<>();

    public Cart() {
    }

    private CartRow isMediaInCart(IMedia m) {
        return cartRowList.stream().filter(x -> x.getMedia() == m).findFirst().orElse(null);
    }

    public void addMedia(IMedia m) {
        CartRow row = isMediaInCart(m);
        if (row == null) {
            cartRowList.add(new CartRow(m, 1));
        } else {
            row.increment();
        }
    }

    public void removeMedia(IMedia m) throws MediaException{
        CartRow cartRow = isMediaInCart(m);
        if (cartRow == null)  {
            throw new MediaException("CartRow non existant");        }
        else {
            if(cartRow.getQuantity() > 1){
                cartRow.decrement();
            }
            else {
                cartRowList.remove(cartRow);
            }
        }
    }

    public void validate() throws MediaException{
        if(getTotalDiscountPrice() <= 0){
            throw new MediaException("price <= 0");
        }
    }

    public double getTotalDiscountPrice() {
        return cartRowList.stream().mapToDouble(x -> x.getMedia().getDiscountPrice()).sum();
    }

    public Set<CartRow> getcartRowList() {
        return cartRowList;
    }
}
