class Solution {
    public int removeElement(int[] nums, int val) {
        int nextValidPostion = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[nextValidPostion] = nums[i];
                nextValidPostion++;
            }
        }
        return nextValidPostion;
    }
}