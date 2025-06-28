class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        //DAY22
        int p=0;
        if(nums[nums.length-1]<target)
        {
            p=nums.length;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==target || nums[i]>target)
                {
                    p=i;
                    break;
                }
            }
        }
        return p;
    }
}