class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<int[]> vals = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                vals.add(new int[]{entry.getKey(), entry.getValue()});
        }
        vals.sort((a,b) -> b[1] - a[1]);
        int[] result = new int[k];
        for (int i=0; i < k; i++) {
            result[i] = vals.get(i)[0];
        }
        return result;
    }
}
