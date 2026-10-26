class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int windowStart = 0;
        int minDiffSoFar = Integer.MAX_VALUE;
        // 1 4 7 9
        for (int windowEnd=0; windowEnd < nums.length; windowEnd++) {

            while ((windowEnd - windowStart) + 1 > k) {
                windowStart++;
            }

            if ((windowEnd - windowStart) + 1 == k) {
                minDiffSoFar = Math.min(minDiffSoFar, nums[windowEnd] - nums[windowStart]);
            }
        }
        return minDiffSoFar;
    }
}