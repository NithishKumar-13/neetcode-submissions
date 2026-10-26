class Solution {
    public int totalFruit(int[] fruits) {
        int maxLenSoFar = Integer.MIN_VALUE;
        int windowStart = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            map.put(fruits[windowEnd], map.getOrDefault(fruits[windowEnd], 0) + 1);
        
            // condition to shrink window
            while (map.size() > 2) {
                map.put(fruits[windowStart], map.get(fruits[windowStart]) - 1);

                if (map.get(fruits[windowStart]) == 0) {
                    map.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            maxLenSoFar = Math.max(maxLenSoFar,windowEnd - windowStart + 1);
        }

        return maxLenSoFar;
    }
}