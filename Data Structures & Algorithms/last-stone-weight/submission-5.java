class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            heap.add(num);
        }
        while (heap.size() > 1) {
            int num1 = heap.poll();
            int num2 = heap.poll();
            int rem = Math.abs(num1 - num2);
            if (rem != 0) heap.add(rem);
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
