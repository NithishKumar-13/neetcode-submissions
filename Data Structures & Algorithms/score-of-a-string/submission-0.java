class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        int idx = 0;
        while (idx < s.length() - 1) {
            int currCharVal = s.charAt(idx) - 'a';
            int nextCharVal = s.charAt(idx+1) - 'a';
            result += Math.abs(nextCharVal - currCharVal);
            idx++;
        }
        return result;
    }
}