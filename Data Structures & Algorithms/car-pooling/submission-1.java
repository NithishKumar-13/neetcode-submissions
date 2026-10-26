class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> map = new TreeMap<>();
        int occupied = 0;
        for (int[] trip : trips) {
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];
            if (map.containsKey(from)) {
                map.put(from, map.get(from) + passengers);
            }
            if (map.containsKey(to)) {
                map.put(to, map.get(to) - passengers);
            }
            map.putIfAbsent(from, passengers);
            map.putIfAbsent(to, passengers * -1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            occupied += entry.getValue();
            if (occupied > capacity) return false;
        }
        return true;
    }

}