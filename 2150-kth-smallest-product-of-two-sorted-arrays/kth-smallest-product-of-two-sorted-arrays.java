class Solution 
{
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) 
    {
        //DAILY QUESTION 1
        long left = -10000000000L, right = 10000000000L;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countLessEqual(nums1, nums2, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long countLessEqual(int[] nums1, int[] nums2, long mid) {
        long count = 0;
        for (int a : nums1) {
            if (a > 0) {
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = l + (r - l) / 2;
                    if ((long)a * nums2[m] <= mid) l = m + 1;
                    else r = m - 1;
                }
                count += l;
            } else if (a < 0) {
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = l + (r - l) / 2;
                    if ((long)a * nums2[m] <= mid) r = m - 1;
                    else l = m + 1;
                }
                count += nums2.length - l;
            } else {
                if (mid >= 0) count += nums2.length;
            }
        }
        return count;
    }
}