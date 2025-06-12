class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        //DAY7 (1st Sliding Window)
        int currsum = 0;
        int low =0;
        int high =0;
        int minwindow = Integer.MAX_VALUE;
        for(high=0;high<nums.length;high++)
        {
            currsum += nums[high];
            while(currsum>=target)
            {
                int currwindow = high-low+1;
                minwindow = Math.min(minwindow,currwindow);
                currsum -= nums[low];
                low++; 
            }
        }
        return minwindow == Integer.MAX_VALUE?0:minwindow;
    }
}