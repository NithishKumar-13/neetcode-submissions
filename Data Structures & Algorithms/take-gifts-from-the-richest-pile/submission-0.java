class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : gifts) {
            maxHeap.add(num);
        }
        int count = k;
        long result = 0;
        while (!maxHeap.isEmpty() && count > 0) {
            int num = maxHeap.poll();
            int sqroot = (int) Math.sqrt(num);
            maxHeap.add(sqroot);
            count--;
        }
        while (!maxHeap.isEmpty()) {
            result += maxHeap.poll();
        }
        return result;
    }
}