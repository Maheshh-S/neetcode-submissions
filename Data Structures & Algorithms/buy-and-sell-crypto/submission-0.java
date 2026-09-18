class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int ans = 0;

        for(int i = 0 ; i < n-1 ; i++){
            int profit = 0;
            for(int j = i+1; j < n;j++){
                profit = prices[j] - prices[i];
                ans = Math.max(profit , ans);
            }
        }
        return ans;
    }
}
