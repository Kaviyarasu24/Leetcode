class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){return 0;}
        int profit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=buy){
                buy=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}