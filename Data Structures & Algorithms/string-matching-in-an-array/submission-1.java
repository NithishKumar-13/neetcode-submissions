class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i=0; i < words.length; i++) {
            String str = words[i];
            for (int j=0; j < words.length; j++) {
                if (i == j) continue;
                String currWord = words[j];
                if (currWord.contains(str)) {
                    list.add(str);
                    break;
                }
            }
        }
        return list;
    }
}