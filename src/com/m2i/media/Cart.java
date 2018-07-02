package com.m2i.media;

import java.util.*;

public class Cart {
    private Set<CartRow> cartRowList = new LinkedHashSet<>();

    public Cart() {
    }

    private CartRow isMediaInCart(IMedia m) {
        CartRow res = null;
        for (CartRow row : cartRowList
                ) {
            if (m == row.getMedia()) {
                res = row;
            }
        }
        return res;
    }

    public void addMedia(IMedia m) {
        CartRow row = isMediaInCart(m);
        if (row == null) {
            cartRowList.add(new CartRow(m, 1));
        } else {
            row.increment();
        }
    }

    public void removeMedia(CartRow cartRow) {
        for (CartRow currItem :
                getcartRowList()) {
            if (currItem.quantity > 1) {
                currItem.decrement();
            } else {
                getcartRowList().remove(cartRow);
            }
        }
    }

    public double getTotalDiscountPrice() {
        double totalDiscountPrice = 0;
        for (CartRow row : getcartRowList()) {
            totalDiscountPrice += row.getPrice();
        }
        return totalDiscountPrice;
    }

    public Set<CartRow> getcartRowList() {
        return cartRowList;
    }
}
