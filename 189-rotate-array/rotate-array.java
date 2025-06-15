class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        //DAY10
        /*TLE*
        while(k>0)
        {
            int a = nums[nums.length-1];
            //System.out.println(a);
            for(int i=nums.length-1;i>=1;i--)
            {
                nums[i]=nums[i-1];
                //System.out.println(nums[i]);
            }
            nums[0]=a;
            k--;
        }*/
        int n = nums.length;
        k = k % n; 
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}