package jda.October._25;


/**
 * 1475. Final Prices With a Special Discount in a Shop
 */
public class FinalPrices {
    public int[] finalPrices(int[] prices) {

        int[] result = new int[prices.length];

        ff:
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    result[i] = prices[i] - prices[j];
                    continue ff;
                }
            }
            result[i] = prices[i];
        }
        return result;

    }
}
