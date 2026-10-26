class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int windowStart = 0;
        int count = 0;
        int currProduct = 1;
        if (k <= 1) return 0;
        for (int windowEnd=0; windowEnd < nums.length; windowEnd++) {
            currProduct *= nums[windowEnd];

            while (currProduct >= k) {
                currProduct /= nums[windowStart++];
            }

                count += (windowEnd - windowStart) + 1;
        }
        return count;
    }
}