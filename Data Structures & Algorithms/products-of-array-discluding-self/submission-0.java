class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ps1 = new int[nums.length];
        int[] ps2 = new int[nums.length];
        int pSum1 = 1;
        ps1[0] = 1;
        for (int i=1; i < nums.length; i++) {
            ps1[i] = ps1[i-1] * nums[i - 1];
        }
        ps2[nums.length - 1] = 1;
        for (int j=nums.length - 2; j >= 0; j--) {
            ps2[j] = ps2[j+1] * nums[j+1];
        }
        for (int k=0; k < nums.length; k++) {
            nums[k] = (ps1[k] * ps2[k]);
        }
        return nums;
    }
}  




