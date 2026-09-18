class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int p = 0;
        int buy = prices[0];

        for(int i = 1; i < n ; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i] - buy > p){
                p = prices[i] - buy;
            }
        }
        return p;
    }
}