class Solution {
    public int maxProfit(int[] prices) {
        int[] buyorsell = new int[prices.length];
        buyorsell[0] = -1;
        if(prices.length == 1) return 0;
        for(int i = 1 ; i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                buyorsell[i] = 2;
            }
            else
            {
                buyorsell[i] = 1;
            }
        }
            int profit = 0;
            if(buyorsell[1] == 2)
                    {
                        profit+=prices[1]-prices[0];
                    }
                
            for(int i = 2; i< prices.length;i++)
            {
                if(buyorsell[i] == 2 && buyorsell[i-1]!=-1)
                {
                    profit+=prices[i]-prices[i-1];
                }
            }
            return profit;
           
        }
    }
