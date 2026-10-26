class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = Integer.MIN_VALUE;
        for (int num : nums) {
            // Find first el of seq
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}
