class Solution 
{
    public int maxProfit(int[] prices) 
    {
        //DAY16
        int n = prices.length;
        int max = 0;
        int buy = prices[0];
        for(int i=1;i<n;i++)
        {
            int curr = prices[i]-buy;
            if(curr>max)
            {
                max = curr;
            }
            if(prices[i]<buy)
            {
                buy = prices[i];
            }
        }
        return max;
    }
}