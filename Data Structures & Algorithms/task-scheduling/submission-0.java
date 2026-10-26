class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : tasks) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : map.values()) {
            heap.add(num);
        }

        int cycles = 0;

        while (!heap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i=0; i < n+1; i++) {
                if (!heap.isEmpty()) {
                    temp.add(heap.poll());
                }
            }
            for (int i : temp) {
                if (--i > 0) heap.add(i);
            }
            cycles += !heap.isEmpty() ? n + 1 : temp.size();
        }
        return cycles;
    }
}
