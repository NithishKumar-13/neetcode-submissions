class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxCapacity = 0;

        while (left < right) {
            int currentCapacity = Math.min(heights[left], heights[right]) * (right - left);
            maxCapacity = Math.max(currentCapacity, maxCapacity);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;
    }
}
