class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];
        
        if(prices.length<=1) return 0;
        
       
        for(int i = 1;i<prices.length;i++)
        {
            if(prices[i]<minprice){minprice= prices[i];}
            int locmaxprofit = prices[i]-minprice;
            if(locmaxprofit>maxprofit)
            {
                maxprofit= locmaxprofit;
            }
        }
        return maxprofit;
    }
}