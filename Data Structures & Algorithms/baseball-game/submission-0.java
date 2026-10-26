class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for (String s : operations) {
            if (s.equals("+")) {
                int t1 = Integer.parseInt(stack.peek());
                stack.pop();
                int t2 = Integer.parseInt(stack.peek());
                stack.push(String.valueOf(t1));
                stack.push(String.valueOf(t1 + t2));
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                int n = Integer.parseInt(stack.peek());
                stack.push(String.valueOf(n * 2));
            } else {
                stack.push(s);
            }
        }
        int result = 0;
        for (String s : stack) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}