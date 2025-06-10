class Solution 
{
    public int majorityElement(int[] nums) 
    {
        //DAY5
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}