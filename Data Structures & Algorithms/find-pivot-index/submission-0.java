class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftPrefixSum = new int[nums.length];
        int[] rightPrefixSum = new int[nums.length];
        int pivotIdx = -1;
        leftPrefixSum[0] = 0;
        for (int i=1; i < nums.length; i++) {
            leftPrefixSum[i] = nums[i-1] + leftPrefixSum[i-1];
        }

        rightPrefixSum[nums.length - 1] = 0;
        for (int j=nums.length - 2; j >= 0; j--) {
            rightPrefixSum[j] = nums[j+1] + rightPrefixSum[j+1];
        }

        for (int k=0; k < nums.length; k++) {
            if (leftPrefixSum[k] == rightPrefixSum[k]) {
                pivotIdx = k;
                break;
            }
        }

        return pivotIdx;
    }
}