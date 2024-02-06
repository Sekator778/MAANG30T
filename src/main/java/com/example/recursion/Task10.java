package com.example.recursion;

public class Task10 {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int[] closesPrice = new int[]{baseCosts[0]};
        for (int iceCreamPrice : baseCosts) {
            getIceScreamPrice(iceCreamPrice, 0,
                    closesPrice, toppingCosts,
                    target);
        }
        return closesPrice[0];
    }

    private void getIceScreamPrice(int desertPrice, int startIndex,
                                   int[] closesPrice, int[] toppingCosts,
                                   int targetPrice) {
        // check last variant before end !!!
        closesPrice[0] = getClosesPrice(desertPrice, closesPrice[0], targetPrice);
        // base case
        if (desertPrice > targetPrice || startIndex == toppingCosts.length) {
            return;
        }
        getIceScreamPrice(desertPrice + 0 * toppingCosts[startIndex],
                startIndex + 1, closesPrice, toppingCosts, targetPrice);
        getIceScreamPrice(desertPrice + 1 * toppingCosts[startIndex],
                startIndex + 1, closesPrice, toppingCosts, targetPrice);
        getIceScreamPrice(desertPrice + 2 * toppingCosts[startIndex],
                startIndex + 1, closesPrice, toppingCosts, targetPrice);
    }

    public int getClosesPrice(int desertPrice, int closesPrice, int targetPrice) {
        int currentPriceDiff = Math.abs(targetPrice - desertPrice);
        int closetPriceDiff = Math.abs(targetPrice - closesPrice);

        if (currentPriceDiff < closetPriceDiff ||
                (currentPriceDiff == closetPriceDiff && desertPrice < closesPrice)
        ) {
            return desertPrice;
        }
        return closesPrice;
    }
}
