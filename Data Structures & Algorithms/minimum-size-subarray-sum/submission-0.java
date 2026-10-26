class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSoFar = Integer.MAX_VALUE;
        int windowStart = 0;
        int currSum = 0;
        for (int windowEnd=0; windowEnd < nums.length; windowEnd++) {
            currSum += nums[windowEnd];

            while (currSum >= target) {
                currSum -= nums[windowStart];
                minSoFar = Math.min(minSoFar, windowEnd - windowStart + 1);
                windowStart++;
            }
        }
        return minSoFar == Integer.MAX_VALUE ? 0 : minSoFar;
    }
}