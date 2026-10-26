class Solution {
    private boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        }
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (isOperator(str)) {
                int num1 = stack.peek();
                stack.pop();
                int num2 = stack.peek();
                stack.pop();
                int result = 0;
                switch (str) {
                    case "+" : {
                        result = num1 + num2;
                        break;
                    }
                    case "-" : {
                        result = num2 - num1;
                        break;
                    }
                    case "*" : {
                        result = num1 * num2;
                        break;
                    }
                    case "/" : {
                        result = num2 / num1;
                        break;
                    } default : {
                        result = 0;
                    }
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}
