class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int lowest = 0;
        for (int i = 1; i<len; i++){
            if (prices[i] > prices[lowest]){
                profit += prices[i] - prices[lowest];
                lowest = i;
                System.out.println("Adding ");
                System.out.println(prices[i] - prices[lowest]);
            } else if (prices[i] <= prices[lowest]){
                lowest = i;
            }
        }
        return profit;
    }
}