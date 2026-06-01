class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length-1;
        int least = prices[0];
        int most = prices[0];
        int profit = 0;
        int now = 0;

        for (int i = 1; i<=len; i++){
            if (prices[i]<least){
                least = prices[i];
                most = prices[i];
            } else if (prices[i]>most){
                most = prices[i];
            }
            now = most-least;
            if (now>profit){
                profit = now;
            }
        }
        return profit;
    }
}