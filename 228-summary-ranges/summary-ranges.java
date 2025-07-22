class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
        //DAY42
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        
        for (int i = 1; i <= nums.length; i++) {
            // End of array or not consecutive
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(start + "");
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}