class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();

        for (String s : strs) {
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String sortedString = new String(chrs);
            dict.putIfAbsent(sortedString, new ArrayList<>());
            dict.get(sortedString).add(s);
        }

        return new ArrayList<>(dict.values());
    }
}
