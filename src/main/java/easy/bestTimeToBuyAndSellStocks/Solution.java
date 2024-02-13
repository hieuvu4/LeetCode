package easy.bestTimeToBuyAndSellStocks;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }
    
        int maxProfit = 0;
        int minPrice = prices[0];
    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
    
        return maxProfit;
        
    }

}
