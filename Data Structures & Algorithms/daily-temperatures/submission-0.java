class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();
        stack.push(len - 1);
        for (int i=temperatures.length - 2; i >= 0; i--) {
            int currEl = temperatures[i];
            while (!stack.isEmpty() && currEl >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}
