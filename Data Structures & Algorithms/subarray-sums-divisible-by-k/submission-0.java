class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefixSum = 0;

        for (int i=0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remainder = prefixSum % k;

            count += map.getOrDefault(remainder,0);

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}