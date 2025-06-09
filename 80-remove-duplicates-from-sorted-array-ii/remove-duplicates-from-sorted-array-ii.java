class Solution {
    public int removeDuplicates(int[] nums) 
    {
        //DAY3
        int k = 1;
        int n = 0;
        int c = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==c)
            {
                n++;
                if(n<=1)
                {
                    nums[k]=nums[i];
                    k++;
                }
            }

            else
            {
                c = nums[i];
                nums[k]=nums[i];
                k++;
                n = 0;
            }

        }
        return k;
    }
}