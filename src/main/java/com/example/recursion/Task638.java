package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return getMinimumPrice(needs, price, 0, special);
    }

    int getMinimumPrice(List<Integer> needs, List<Integer> prices, int offerIndex, List<List<Integer>> offers) {
        int minPrice = applyPrice(prices, needs);
        if (minPrice == 0) {
            return 0;
        }
        for (int i = offerIndex; i < offers.size(); i++) {
            List<Integer> offer = offers.get(i);
            int offerPrice = offer.getLast();
            List<Integer> updateNeeds = applyOffer(needs, offer);

            if (updateNeeds == null) {
                continue;
            }
            int priceWithOffer = offerPrice + getMinimumPrice(updateNeeds, prices, i, offers);
            minPrice = Math.min(minPrice, priceWithOffer);
        }
        return minPrice;
    }

    private List<Integer> applyOffer(List<Integer> needs, List<Integer> offer) {
        List<Integer> remainderNeeds = new ArrayList<>(needs.size());
        for (int i = 0; i < needs.size(); i++) {
            int diff = needs.get(i) - offer.get(i);
            if (diff < 0) {
                return null;
            } else {
                remainderNeeds.add(diff);
            }
        }
        return remainderNeeds;
    }

    private int applyPrice(List<Integer> prices, List<Integer> needs) {
        int price = 0;
        for (int i = 0; i < prices.size(); i++) {
            price += prices.get(i) * needs.get(i);
        }
        return price;
    }
}
