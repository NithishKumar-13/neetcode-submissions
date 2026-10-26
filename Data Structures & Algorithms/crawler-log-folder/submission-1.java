class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String s : logs) {
            if (s.equals("../") && !stack.isEmpty()) {
                stack.pop();
            } else if (!s.equals("./") && !s.equals("../")){
                stack.push(s);
            }
        }
        System.out.println(stack);
        return stack.size();
    }
}