class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        boolean hasOdd = false;

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for (int num : map.values()) {
            if (num % 2 == 0) {
                res += num;
            } else {
                res += num - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) res++;

        return res;
    }
}