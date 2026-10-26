class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (map.containsKey(nums[windowEnd])) {
                int idx = map.get(nums[windowEnd]);
                if (Math.abs(idx - windowEnd) <= k) {
                    return true;
                }
            }
            map.put(nums[windowEnd], windowEnd);
        }
        return false;
    }
}