class Solution 
{
    public int singleNumber(int[] nums) 
    {
        //DAY 53
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}