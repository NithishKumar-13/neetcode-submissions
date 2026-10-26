class Solution {
    class Pair {
        int value;
        int index;

        public Pair(int val, int idx) {
            this.value = val;
            this.index = idx;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Pair> minHeap = new PriorityQueue<>((a,b) -> {
            if (a.value != b.value) return Integer.compare(a.value, b.value);
            return Integer.compare(a.index, b.index);
        });

        for(int i=0; i < nums.length; i++) {
            minHeap.add(new Pair(nums[i], i));
        }
        int count = k;
        while (count > 0) {
            Pair minPair = minHeap.poll();
            nums[minPair.index] = minPair.value * multiplier;
            minHeap.add(new Pair(nums[minPair.index], minPair.index));
            count--;
        }
        return nums;
    }
}