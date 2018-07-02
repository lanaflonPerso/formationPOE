package com.m2i.media;

import java.util.ArrayList;

public class Cart {
    ArrayList<MediaQuantity> mediaQuantitieList = new ArrayList<>();

    public Cart() {
    }

    public void addMedia(MediaQuantity media) {
        for (int i = 0; i < mediaQuantitieList.size() - 1; i++) {
            if (mediaQuantitieList.contains(mediaQuantitieList.get(i))) {
                mediaQuantitieList.get(i).setQuantity(mediaQuantitieList.get(i).getQuantity() + 1);
            } else
                mediaQuantitieList.add(media);
        }
    }

    public void removeMedia(MediaQuantity media) {
        for (MediaQuantity currItem :
                mediaQuantitieList) {
            if (currItem.getQuantity() > 1) {
                currItem.setQuantity(currItem.getQuantity() - 1);
            } else mediaQuantitieList.remove(media);
        }
    }

    public double getTotalDiscountPrice(){
        double totalDiscountPrice = 0;
        for (int i = 0; i < mediaQuantitieList.size() - 1; i++) {
            totalDiscountPrice += mediaQuantitieList.get(i).getQuantityDiscountPrice();
        }
        return totalDiscountPrice;
    }
}
