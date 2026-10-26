class Solution {
    public void moveZeroes(int[] nums) {
        int nextValidPos = 0;
        for (int i=0 ; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[nextValidPos] = num;

                if (nextValidPos != i) {
                    nums[i] = 0;
                }
                nextValidPos++;
            }
        }
        return;
    }
} 