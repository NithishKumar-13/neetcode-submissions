class Solution {
    public int minimumRecolors(String blocks, int k) {
        int noOfWhites = 0;
        int windowStart = 0;
        int minSoFar = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < blocks.length(); windowEnd++) {
            char ch = blocks.charAt(windowEnd);
            if (ch == 'W') noOfWhites++;

            while ((windowEnd - windowStart) + 1 > k) {
                char c = blocks.charAt(windowStart);
                if (c == 'W') noOfWhites--;
                windowStart++;
            }

            if ((windowEnd - windowStart) + 1 == k) {
                minSoFar = Math.min(minSoFar, noOfWhites);
            }
        }
        return minSoFar;
    }
}