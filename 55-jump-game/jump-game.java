class Solution 
{
    public boolean canJump(int[] nums) 
    {
        //DAY13
        int lpos = nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i]>=lpos)
            {
                lpos = i;
            }
        }
        return lpos == 0;
    }
}